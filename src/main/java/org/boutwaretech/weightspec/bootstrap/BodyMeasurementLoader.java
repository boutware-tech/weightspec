package org.boutwaretech.weightspec.bootstrap;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.boutwaretech.weightspec.configuration.Profiles;
import org.boutwaretech.weightspec.constants.Gender;
import org.boutwaretech.weightspec.constants.HeightUnit;
import org.boutwaretech.weightspec.constants.WeightUnit;
import org.boutwaretech.weightspec.domain.BodyMeasurement;
import org.boutwaretech.weightspec.domain.BodyMeasurementApproval;
import org.boutwaretech.weightspec.domain.BodyMeasurementTransaction;
import org.boutwaretech.weightspec.repositories.BodyMeasurementApprovalRepository;
import org.boutwaretech.weightspec.repositories.BodyMeasurementRepository;
import org.boutwaretech.weightspec.repositories.BodyMeasurementTransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Profile;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
@Profile(Profiles.DEV)
public class BodyMeasurementLoader implements ApplicationListener<ContextRefreshedEvent> {

    private BodyMeasurementRepository bmRepository;
    private BodyMeasurementTransactionRepository bmtRepository;
    private BodyMeasurementApprovalRepository bmaRepository;

    private Logger log = Logger.getLogger(BodyMeasurementLoader.class);

    @Autowired
    public void setBodyMeasurementRepository(BodyMeasurementRepository bmRepository) {
        this.bmRepository = bmRepository;
    }

    @Autowired
    public void setBodyMeasurementTransactionRepository(BodyMeasurementTransactionRepository bmtRepository) {
        this.bmtRepository = bmtRepository;
    }

    @Autowired
    public void setBodyMeasurementApprovalRepository(BodyMeasurementApprovalRepository bmaRepository) {
        this.bmaRepository = bmaRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent arg0) {
        makeBodyMeasurement("Alan", "Alanson", 111);
        makeBodyMeasurement("Bob", "Bobson", 112);
        makeBodyMeasurement("Carl", "Carlson", 113);
        
        BodyMeasurement bm1 = makeBodyMeasurement("John", "Smith", 123);

        BodyMeasurementTransaction bmt1 = new BodyMeasurementTransaction();
        List<BodyMeasurement> bmList1 = new ArrayList<>();
        bmList1.add(bm1);
        bmt1.setMeasurements(bmList1);
        bmt1.setTeamId(1111L);
        bmtRepository.save(bmt1);
        
        bm1.setTransaction(bmt1);
        bmRepository.save(bm1);
        
        BodyMeasurementApproval bma1 = new BodyMeasurementApproval();
        bma1.setBodyMeasurement(bm1);
        bma1.setTransaction(bmt1);
        bmaRepository.save(bma1);

        log.info("Saved measurement - id: " + bm1.getId());

        BodyMeasurement bm2 = makeBodyMeasurement("Dan", "Gable", 112233);

        BodyMeasurementTransaction bmt2 = new BodyMeasurementTransaction();
        List<BodyMeasurement> bmList2 = new ArrayList<>();
        bmList2.add(bm2);
        bmt2.setMeasurements(bmList2);
        bmt2.setTeamId(1111L);
        
        bmtRepository.save(bmt2);
        
        bm2.setTransaction(bmt2);
        bmRepository.save(bm2);
        
        BodyMeasurementApproval bma2 = new BodyMeasurementApproval();
        bma2.setBodyMeasurement(bm2);
        bma2.setTransaction(bmt2);
        bmaRepository.save(bma2);

        log.info("Saved measurement - id: " + bm2.getId());
    }
    
    private BodyMeasurement makeBodyMeasurement(String first, String last, Integer athleteId) {
        BodyMeasurement bm = new BodyMeasurement();
        bm.setAthleteId(athleteId);
        bm.setAthleteFirstName(first);
        bm.setAthleteLastName(last);
        bm.setTeamId(654);
        bm.setHeight(70.0);
        bm.setHeightUnit(HeightUnit.INCH);
        bm.setWeight(150.0);
        bm.setWeightUnit(WeightUnit.LBS);
        bm.setSpecificGravity(2.3);
        bm.setPassedHydration(false);
        bm.setBodyFatPercent(15.6);
        bm.setSkinfoldAbdominal("[1.1, 1.2, 1.3]");
        bm.setSkinfoldBicep("[2.1,2.2,2.3]");
        bm.setSkinfoldCalf("[1.1,2.2,3.3]");
        bm.setSkinfoldTricep("[2.1,2.2,2.3]");
        bm.setSkinfoldSubscapula("[1.1, 1.2, 1.3]");
        bm.setSkinfoldSupraspinale("[1.4,1.5,1.6]");
        bm.setGoverningBodyId(246);
        bm.setGender(Gender.MALE);
        bm.setComments("HELLO");
        bmRepository.save(bm);
        
        return bm;
    }
}
