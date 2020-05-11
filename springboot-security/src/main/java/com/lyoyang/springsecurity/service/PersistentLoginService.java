package com.lyoyang.springsecurity.service;

import com.lyoyang.springsecurity.entity.PersistentLogins;
import com.lyoyang.springsecurity.mapper.PersistentLoginsMapper;
import org.springframework.security.web.authentication.rememberme.PersistentRememberMeToken;
import org.springframework.security.web.authentication.rememberme.PersistentTokenRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;

@Service
public class PersistentLoginService implements PersistentTokenRepository {

    @Resource
    private PersistentLoginsMapper persistentLoginsMapper;

    @Override
    public void createNewToken(PersistentRememberMeToken persistentRememberMeToken) {
        PersistentLogins persistentLogins = new PersistentLogins();
        persistentLogins.setLastUsed(persistentRememberMeToken.getDate());
        persistentLogins.setSeries(persistentRememberMeToken.getSeries());
        persistentLogins.setToken(persistentRememberMeToken.getTokenValue());
        persistentLogins.setUsername(persistentRememberMeToken.getUsername());
        persistentLoginsMapper.insertSelective(persistentLogins);
    }

    @Override
    public void updateToken(String series, String token, Date date) {
        PersistentLogins persistentLogins = new PersistentLogins();
        persistentLogins.setSeries(series);
        persistentLogins.setToken(token);
        persistentLogins.setLastUsed(date);
        persistentLoginsMapper.updateByPrimaryKeySelective(persistentLogins);
    }

    @Override
    public PersistentRememberMeToken getTokenForSeries(String series) {
        PersistentLogins persistentLogins = persistentLoginsMapper.selectByPrimaryKey(series);
        PersistentRememberMeToken persistentRememberMeToken = null;
        if (persistentLogins != null) {
            persistentRememberMeToken = new PersistentRememberMeToken(persistentLogins.getUsername(),
                    persistentLogins.getSeries(), persistentLogins.getToken(), persistentLogins.getLastUsed());
        }
        return persistentRememberMeToken;
    }

    @Override
    public void removeUserTokens(String series) {
        persistentLoginsMapper.deleteByPrimaryKey(series);
    }
}
