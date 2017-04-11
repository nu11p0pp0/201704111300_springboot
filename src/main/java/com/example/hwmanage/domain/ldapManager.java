/**
 * 
 */
package com.example.hwmanage.domain;

import java.util.Hashtable;

import javax.naming.Context;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.ldap.authentication.ad.ActiveDirectoryLdapAuthenticationProvider;

/**
 * @author saitoshu
 *
 */
public class ldapManager {

	public static void main(String[] args) throws Exception {

		ActiveDirectoryLdapAuthenticationProvider provider = new ActiveDirectoryLdapAuthenticationProvider(
				"mbnet.local", "ldap://ZHONDC00:389");
//		Authentication authentication = new UsernamePasswordAuthenticationToken(principal, credentials);
//		provider.authenticate(authentication );

		Hashtable<String, String> env = new Hashtable<String, String>();
		env.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.ldap.LdapCtxFactory");
		env.put(Context.PROVIDER_URL, "ldap://ZHONDC00:389");
		env.put(Context.SECURITY_AUTHENTICATION, "simple");
		env.put(Context.SECURITY_PRINCIPAL, "tok_bkop" + "@" + "mbnet.local");
		env.put(Context.SECURITY_CREDENTIALS, "Tokio");

		DirContext ctx = null;
		try {
			// 初期コンテキストの作成
			ctx = new InitialDirContext(env);
//			ctx.get
		} catch (Exception e) {
			// 認証エラーの場合,エラーメッセージをセットする
			return;
		} finally {
			if (ctx != null) {
				ctx.close();
			}
		}

	}

}
