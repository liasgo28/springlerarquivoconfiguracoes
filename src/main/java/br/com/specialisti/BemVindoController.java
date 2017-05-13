package br.com.specialisti;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * Created by User on 13/05/2017.
 * ProjectName springlerarquivoconfiguracoes.
 */
@Controller
public class BemVindoController {
    private static final Logger logger = LoggerFactory.getLogger(BemVindoController.class);

    private AppProperties app;
    private GlobalProperties global;

    @Autowired
    public void setApp(AppProperties app) {
        this.app = app;
    }

    @Autowired
    public void setGlobal(GlobalProperties global) {
        this.global = global;
    }

    @RequestMapping("/")
    public String bemvindo(Map<String, Object> model) {

        String appProperties = app.toString();
        String globalProperties = global.toString();

        GlobalProperties teste = new GlobalProperties();
        logger.info(teste.getEmail());

        logger.info("Bem vindo {}, {}", app, global);

        model.put("message", appProperties + globalProperties);
        return "bemvindo";
    }
}
