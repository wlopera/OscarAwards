package test;

import java.util.List;
import javax.ejb.embeddable.EJBContainer;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.wlopera.jee.domain.Gender;
import com.wlopera.jee.service.GenderServiceLocal;

public class GenderServiceTest {

    private GenderServiceLocal genderService;
    
    @Before
    public void setUp() throws Exception {
        EJBContainer contenedor = EJBContainer.createEJBContainer();
        
        genderService = (GenderServiceLocal) 
           contenedor.getContext().lookup("java:global/classes/GenderServiceImpl!com.wlopera.jee.service.GenderServiceLocal");        
    }
    
    @Test
    public void testEJBPersonaService() {
        System.out.println("##=> Iniciando llamada al EJB_Local desde el cliente\n");        
        
        Assert.assertTrue(genderService != null);
        
        List<Gender> genders =  genderService.getGenders();
        
        Assert.assertEquals(4, genders.size());
        
        System.out.println("\n##=> El número de generos es igual a: " + genders.size());
        
        desplegarPersonas(genders);
        System.out.println("\n##=> Fin  llamada al EJB-Local desde el cliente");                     

    }
    
    private void desplegarPersonas(List<Gender> genders) {
        for(Gender gender : genders) {
            System.out.println("##=> " + gender);
        }
    }
}
