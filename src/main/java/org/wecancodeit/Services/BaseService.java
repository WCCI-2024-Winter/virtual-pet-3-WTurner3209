package org.wecancodeit.Services;

import org.springframework.stereotype.Service;
import org.wecancodeit.Models.ContactModel;
import org.wecancodeit.Models.OrganicPetModel;
import org.wecancodeit.Models.PetMaintenanceModel;
import org.wecancodeit.Models.RoboticPetModel;
import org.wecancodeit.Models.ScheduleModel;

@Service
public class BaseService {
    public static boolean isValidContact(ContactModel contact){
        return true;
    }
    public static boolean isValidOrganic(OrganicPetModel organic){
        return true;
    }
    public static boolean isValidRobotic(RoboticPetModel robotic) {
        return true;
    }
    public static boolean isValidMaintenance(PetMaintenanceModel maintenance) {
        return true;
    }
    public static boolean isValidSchedule(ScheduleModel schedule) {
        return true;
    }
    
}
