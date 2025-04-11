package org.example.issuer;

import org.apache.oltu.oauth2.common.exception.OAuthSystemException;
import org.wso2.carbon.identity.oauth2.authz.OAuthAuthzReqMessageContext;
import org.wso2.carbon.identity.oauth2.token.OAuthTokenReqMessageContext;
import org.wso2.carbon.identity.oauth2.token.OauthTokenIssuerImpl;

public class CustomTokenIssuer extends OauthTokenIssuerImpl {


    @Override
    public String accessToken(OAuthAuthzReqMessageContext oauthAuthzMsgCtx) throws OAuthSystemException {
        System.out.println("CustomTokenIssuer accessToken(OAuthAuthzReqMessageContext oauthAuthzMsgCtx)");
        if (1 == 1) throw new RuntimeException("1");
        return null;

    }

    @Override
    public String refreshToken(OAuthAuthzReqMessageContext oauthAuthzMsgCtx) throws OAuthSystemException {
        if (1 == 1) throw new RuntimeException("2");
        System.out.println("CustomTokenIssuer refreshToken(OAuthAuthzReqMessageContext oauthAuthzMsgCtx)");
        return null;
    }

    @Override
    public String accessToken(OAuthTokenReqMessageContext tokReqMsgCtx) throws OAuthSystemException {
        System.out.println("CustomTokenIssuer accessToken(OAuthTokenReqMessageContext tokReqMsgCtx)");
        return super.accessToken(tokReqMsgCtx);
    }

    @Override
    public String refreshToken(OAuthTokenReqMessageContext tokReqMsgCtx) throws OAuthSystemException {

        System.out.println("CustomTokenIssuer refreshToken(OAuthAuthzReqMessageContext tokReqMsgCtx)");
        return super.refreshToken(tokReqMsgCtx);
    }
}