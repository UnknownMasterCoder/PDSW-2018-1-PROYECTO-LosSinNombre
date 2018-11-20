package edu.eci.pdsw.managedbeans;

import com.google.inject.Inject;
import edu.eci.pdsw.entities.Intention;
import edu.eci.pdsw.services.InitiativeBankServices;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@SessionScoped
@ManagedBean(name = "intentionBean")

public class IntentionBean extends BasePageBean{
    
    @Inject
    private InitiativeBankServices initiativeBankServices;

    public IntentionBean() {
        
    }       
    
    public List<Intention> consult() throws Exception{
        try {
            return initiativeBankServices.consultaIntencion();
        } catch (Exception e) {
            throw e;
        }
    }
}
