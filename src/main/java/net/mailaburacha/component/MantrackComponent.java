package net.mailaburacha.component;
import net.mailaburacha.Model.MantrackJson;
import org.springframework.http.ResponseEntity;
public interface MantrackComponent {

    ResponseEntity updateMantrackV2(MantrackJson mantrackJson) throws Exception;

    ResponseEntity deleteMantrackV2(MantrackJson mantrackJson) throws Exception;

}
