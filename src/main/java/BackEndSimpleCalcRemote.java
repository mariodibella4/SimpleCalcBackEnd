
import javax.ejb.Remote;

@Remote
public interface BackEndSimpleCalcRemote {
    public abstract String getSolution(String input);
}
