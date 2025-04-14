package org.example.token;

import org.wso2.carbon.apimgt.api.APIManagementException;
import org.wso2.carbon.apimgt.keymgt.service.TokenValidationContext;
import org.wso2.carbon.apimgt.keymgt.token.JWTGenerator;

import java.util.Map;

public class CustomJWTGenerator extends JWTGenerator {

    @Override
    public Map<String, String> populateStandardClaims(TokenValidationContext validationContext) throws APIManagementException {
        System.out.println("CustomJWTGenerator: populateStandardClaims ");
        if (1 == 1) throw new RuntimeException("1");
        return super.populateStandardClaims(validationContext);
    }

    @Override
    public Map<String, String> populateCustomClaims(TokenValidationContext validationContext) throws APIManagementException {
        System.out.println("CustomJWTGenerator: populateCustomClaims ");
        if (1 == 1) throw new RuntimeException("2");
        return super.populateCustomClaims(validationContext);
    }

    @Override
    public String generateToken(TokenValidationContext validationContext) throws APIManagementException {
        System.out.println("CustomJWTGenerator: generateToken ");
        if (1 == 1) throw new RuntimeException("3");
        return super.generateToken(validationContext);
    }

    @Override
    public byte[] signJWT(String assertion, String tenantDomain) throws APIManagementException {
        System.out.println("CustomJWTGenerator: signJWT ");
        if (1 == 1) throw new RuntimeException("4");
        return super.signJWT(assertion, tenantDomain);
    }
}
