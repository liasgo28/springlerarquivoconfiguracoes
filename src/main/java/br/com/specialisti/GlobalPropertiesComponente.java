package br.com.specialisti;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.stereotype.Component;

/**
 * Created by User on 13/05/2017.
 * ProjectName springlerarquivoconfiguracoes.
 * Description: Utilizando o ConfigurationProperties para nao precisar da anotacao @value.
 */

@Component
@PropertySources(value = {@PropertySource("classpath:global.properties")})
@ConfigurationProperties // sem prefixo, encontra os valores no raiz.
public class GlobalPropertiesComponente {
    private int threadPool;
    private String email;

    public int getThreadPool() {
        return threadPool;
    }

    public void setThreadPool(int threadPool) {
        this.threadPool = threadPool;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
