package nl.rls.composer.rest.dto;

import javax.xml.bind.annotation.XmlRootElement;

import io.swagger.annotations.ApiModel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import nl.rls.composer.rest.dto.hateoas.IdentifiableRepresentationModel;

@XmlRootElement
@NoArgsConstructor
@Getter
@Setter
@ApiModel(description = "Identification code of a freight wagon based on the TSI OPE and CEN Recommendations and CIS wagons coded according to OSJD-UIC leaflet 402, which allows the conversion from 8 digits to 12 digits and viceversa.")
public class WagonDto extends IdentifiableRepresentationModel<WagonDto> {
    private String numberFreight;
    private String typeName;
    private String code;
    private int lengthOverBuffers;
    private int wagonNumberOfAxles;
    private int weightEmpty;
    private int brakeWeightG;
    private int brakeWeightP;
    private int maxSpeed;
}
