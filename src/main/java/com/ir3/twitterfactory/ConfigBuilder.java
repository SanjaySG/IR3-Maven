package com.ir3.twitterfactory;

import twitter4j.conf.ConfigurationBuilder;

public class ConfigBuilder {

	private static final String OAuth_Consumer_Key = <OAuth_Consumer_Key>;
	private static final String OAuth_Consumer_Secret = <OAuth_Consumer_Secret>;
	private static final String OAuth_Access_Token = <OAuth_Access_Token>;
	private static final String OAuth_Access_Secret = <OAuth_Access_Secret>;
	private static ConfigurationBuilder conf;

	protected static final ConfigurationBuilder getConfig() {
		if(null == conf)
			conf = new ConfigurationBuilder();
		
		setConfBuilderParams();
		return conf;
	}
	
	private static void setConfBuilderParams() {
		conf.setDebugEnabled(true).setOAuthConsumerKey(OAuth_Consumer_Key)
				.setOAuthConsumerSecret(OAuth_Consumer_Secret)
				.setOAuthAccessToken(OAuth_Access_Token)
				.setOAuthAccessTokenSecret(OAuth_Access_Secret);
	}
}
