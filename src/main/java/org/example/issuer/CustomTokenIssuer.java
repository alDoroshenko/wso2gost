package org.example.issuer;

import org.apache.oltu.oauth2.common.exception.OAuthSystemException;
import org.osgi.service.component.annotations.Component;
import org.wso2.carbon.identity.oauth2.token.OAuthTokenReqMessageContext;
import org.wso2.carbon.identity.oauth2.token.OauthTokenIssuer;
import org.wso2.carbon.identity.oauth2.token.OauthTokenIssuerImpl;

@Component(name = "custom.token.issuer", service = OauthTokenIssuer.class)
public class CustomTokenIssuer extends OauthTokenIssuerImpl  {

    public CustomTokenIssuer() {

    }

    @Override
    public String accessToken(OAuthTokenReqMessageContext tokReqMsgCtx) throws OAuthSystemException {
        if (true) {
            throw new RuntimeException("CustomTokenIssuer.accessToken!");
        }
        String uuidToken = super.accessToken(tokReqMsgCtx);
        return "custom_" + uuidToken;
    }

    @Override
    public String refreshToken(OAuthTokenReqMessageContext tokReqMsgCtx) throws OAuthSystemException {
        if (true) {
            throw new RuntimeException("CustomTokenIssuer.accessToken!");
        }
        String uuidToken = super.refreshToken(tokReqMsgCtx);
        return "custom_" + uuidToken;
    }
}