# weightspec
This is a system for managing and tracking factors that relate to an athlete's weight. The goal of the system is to provide information that will lead to smarter and safer weight loss, as well as maximum athletic performance. This is mostly targetted towards sports where weight classes are an integral part of competition (_ex. Wrestling, Boxing, Judo, BJJ_). 

## Requirements
1. **Identity data**  
   The system will maintain the minimal amount of data to identify athletes and other users (_ex : id/username, first-name, last-name, date-of-birth_). Detailed identity-type data, as well as team and roster data, will be sourced from another system. Authentication and authorization (RBAC) will also be performed by this other system.  
2. **Athlete body measurements**  
   The system will provide an interface to enter and maintain per-athlete records of data for weight management purposes. The structure of the data could be different for each athlete (due to different governing body rules). Therefore, this will need to be flexible and configurable. This dataset could include some of the following :
     1. Weight
     2. Hydration level
     3. Body fat percentage
     4. Skin fold measurements (for body fat analysis)
3. **Audit record management**  
   The system will provide an interface to manage the auditing or verification of athlete body measurement data by users defined as an Auditor. Once the athlete's measurement records have been entered, they will be available to be verified. The Auditor will be able to either accept or reject the athlete records. 
4. **Challenge and Appeals**  
   The system will provide an interface to challenge and/or appeal an athlete record that has been verified by an Auditor. The challenge/appeal process could be different due to different governing body rules. Therefore, this will need to be flexible and configurable. 
5. **Competition weigh-in data**  
   In addition to athlete body measurements, the system will provide an interface to enter and maintain per-athlete records for competition weigh-in data. 
6. **Roles**
   Certain aspects and operations of the system will only be available to authorized users. For example, auditing records must only be done by a designated Auditor, athlete body measurements should only be entered and editted by a Coach or Team Manager for that particular athlete. Therefore, the system must identify these roles and secure these operations.
