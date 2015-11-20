package com.bonc.sh;

import java.util.List;
import java.util.ArrayList;

import org.apache.hadoop.hive.ql.parse.AbstractSemanticAnalyzerHook;
import org.apache.hadoop.hive.ql.parse.ASTNode;

import org.apache.hadoop.hive.ql.parse.HiveParser;
import org.apache.hadoop.hive.ql.parse.HiveSemanticAnalyzerHookContext;
import org.apache.hadoop.hive.ql.parse.SemanticException;
import org.apache.hadoop.hive.ql.session.SessionState;

/**
 * 设置Hive超级管理员
 * 
 * @author
 * @version $Id: AuthHook.java,20150611,pingxiaogang
 */
public class AuthHook extends AbstractSemanticAnalyzerHook {
	private static String admin = "hadoop";
	private static String admin1 = "shadmin";
	 
	@Override
	public ASTNode preAnalyze(HiveSemanticAnalyzerHookContext context,
			ASTNode ast) throws SemanticException {

		switch (ast.getToken().getType()) {
		case HiveParser.TOK_CREATEDATABASE:
		case HiveParser.TOK_DROPDATABASE:
		case HiveParser.TOK_CREATEROLE:
		case HiveParser.TOK_DROPROLE:
		case HiveParser.TOK_GRANT:
		case HiveParser.TOK_REVOKE:
		case HiveParser.TOK_GRANT_ROLE:
		case HiveParser.TOK_REVOKE_ROLE:
			String userName = null;
			if (SessionState.get() != null
					&& SessionState.get().getAuthenticator() != null) {
				userName = SessionState.get().getAuthenticator().getUserName();
				
			}
			if (!admin.equalsIgnoreCase(userName) && !admin1.equalsIgnoreCase(userName) ) {
				throw new SemanticException(userName
						+ " can't use ADMIN options, except " + admin + " or "+admin1+".");
			}
			break;
		default:
			break;
		}
		return ast;
	}
	private static List ArrayList() {
		// TODO Auto-generated method stub
		return null;
	}

}
