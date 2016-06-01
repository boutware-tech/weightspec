package org.boutwaretech.weightspec.bootstrap;

import org.apache.log4j.Logger;
import org.boutwaretech.weightspec.configuration.Profiles;
import org.boutwaretech.weightspec.constants.Constants;
import org.boutwaretech.weightspec.domain.BodyMeasurement;
import org.boutwaretech.weightspec.repositories.BodyMeasurementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Profile;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
@Profile(Profiles.DEV)
public class BodyMeasurementLoader implements ApplicationListener<ContextRefreshedEvent> {

    private BodyMeasurementRepository bmRepository;

    private Logger log = Logger.getLogger(BodyMeasurementLoader.class);

    @Autowired
    public void setWeightAssessmentRepository(BodyMeasurementRepository bmRepository) {
        this.bmRepository = bmRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent arg0) {
        BodyMeasurement bm1 = new BodyMeasurement();
        bm1.setAthleteId(123);
        bm1.setAthleteFirstName("John");
        bm1.setAthleteLastName("Smith");
        bm1.setTeamId(987);
        bm1.setHeight(60.0);
        bm1.setHeightUnit(Constants.UNIT_INCH);
        bm1.setWeight(100.0);
        bm1.setWeightUnit(Constants.UNIT_LB);
        bm1.setSpecificGravity(4.5);
        bm1.setPassedHydration(true);
        bm1.setBodyFatPercent(12.3);
        bm1.setSkinfoldAbdominal("[1.1, 1.2, 1.3]");
        bm1.setSkinfoldBicep("[2.1,2.2,2.3]");
        bm1.setSkinfoldCalf("[1.1,2.2,3.3]");
        bm1.setSkinfoldTricep("[2.1,2.2,2.3]");
        bm1.setSkinfoldSubscapula("[1.1, 1.2, 1.3]");
        bm1.setSkinfoldSupraspinale("[1.4,1.5,1.6]");
        bm1.setTransactionId(555);
        bm1.setGoverningBodyId(135);
        bm1.setGender(Constants.GENDER_MALE);
        bm1.setComments("NONE");
        bmRepository.save(bm1);

        log.info("Saved measurement - id: " + bm1.getId());

        BodyMeasurement bm2 = new BodyMeasurement();
        bm2.setAthleteId(456);
        bm2.setAthleteFirstName("Dan");
        bm2.setAthleteLastName("Gable");
        bm2.setTeamId(654);
        bm2.setHeight(70.0);
        bm2.setHeightUnit(Constants.UNIT_INCH);
        bm2.setWeight(150.0);
        bm2.setWeightUnit(Constants.UNIT_LB);
        bm2.setSpecificGravity(2.3);
        bm2.setPassedHydration(false);
        bm2.setBodyFatPercent(15.6);
        bm2.setSkinfoldAbdominal("[1.1, 1.2, 1.3]");
        bm2.setSkinfoldBicep("[2.1,2.2,2.3]");
        bm2.setSkinfoldCalf("[1.1,2.2,3.3]");
        bm2.setSkinfoldTricep("[2.1,2.2,2.3]");
        bm2.setSkinfoldSubscapula("[1.1, 1.2, 1.3]");
        bm2.setSkinfoldSupraspinale("[1.4,1.5,1.6]");
        bm2.setTransactionId(999);
        bm2.setGoverningBodyId(246);
        bm2.setGender(Constants.GENDER_FEMALE);
        bm2.setComments("HELLO");
        bmRepository.save(bm2);

        log.info("Saved measurement - id: " + bm2.getId());
    }
}
