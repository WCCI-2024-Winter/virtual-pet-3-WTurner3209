package org.wecancodeit;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.wecancodeit.Models.*;
import org.wecancodeit.Models.Enums.*;

import org.wecancodeit.Services.*;

import jakarta.annotation.Resource;

@Component
public class Populator implements CommandLineRunner {

    @Resource
    private final AdopterService adopterService;

    @Resource
    private final OrganicPetService organicPetService;

    @Resource
    private final PetMaintenanceService petMaintenanceService;

    @Resource

    private final PetScheduleService petScheduleService;

    @Resource
    private final RoboticPetService roboticPetService;

    @Resource
    private final ShelterService shelterService;

    @Resource
    private final VolunteerService volunteerService;

    public Populator(AdopterService adopterService, OrganicPetService organicPetService,
            PetMaintenanceService petMaintenanceService, PetScheduleService petScheduleService,
            RoboticPetService roboticPetService, ShelterService shelterService, VolunteerService volunteerService) {
        this.adopterService = adopterService;
        this.organicPetService = organicPetService;
        this.petMaintenanceService = petMaintenanceService;
        this.petScheduleService = petScheduleService;
        this.roboticPetService = roboticPetService;
        this.shelterService = shelterService;
        this.volunteerService = volunteerService;
    }

    @Override
    public void run(String... args) throws Exception {
        ShelterModel shelterModel = new ShelterModel("Human Shelter", "5768 luka rd", "add 2",
                "WhiteHall", "Oh", "44221", "756473773", "Noway1@Gmail.com", "",
                "null");
        shelterModel.setId(1l);
        shelterService.saveShelter(shelterModel);

        // ShelterModel shelterModel2 = new ShelterModel("Cat Shelter", "5746 new balance rd", "add 2",
        //         "Zanesville", "Oh", "46353", "6143321112", "Noway2@Gmail.com", "",
        //         "null");
        // shelterModel2.setId(2l);

        // ShelterModel shelterModel3 = new ShelterModel("DOG Shelter", "5236 Nike rd", "add 2",
        //         "Grove City", "Oh", "33353", "6143343112", "Noway3@Gmail.com", "",
        //         "null");
        // shelterModel3.setId(3l);

        // AdoptersModel adoptersModel = new AdoptersModel("John Smith", "3244 high street", "add 2", 
        // "Columbus", "OH", "43543", "438548382", "g@gmail.com",
        //  "null", AdoptionsStatusEnum.APPROVED, "note",PetTypeEnums.DOG);
        
        // adoptersModel.setId(1l);
        // adopterService.saveAdopter(adoptersModel);

        // AdoptersModel adoptersModel2 = new AdoptersModel("Kat Williams", "4432 fire street", null,
        //         "London", "oh", "42454", "9267659392", "KW@Yahoo.com", "null", AdoptionsStatusEnum.REQUESTED, "note",
        //         PetTypeEnums.DOG);
        // adoptersModel2.setId(2l);

        // AdoptersModel adoptersModel3 = new AdoptersModel("Travis Johns", "3234 Underline street", null,
        //         "Hilliard", "oh", "57684", "4657899304", "TravelJohn@Yahoo.com", null,AdoptionsStatusEnum.APPROVED , "note",
        //         PetTypeEnums.ROBOTIC_DOG);
        // adoptersModel3.setId(3l);

        // OrganicPetModel organicPetModel = new OrganicPetModel("Winnie", PetTypeEnums.DOG, null, "Huskey", 2,
        //         PetHeathEnums.HEALTHY, PetMoodEnums.EXCITED, TempermentEnums.SUSPICIOUS, AdoptionsStatusEnum.NONE,
        //         "no notes");
        // organicPetModel.setId(1l);

        // OrganicPetModel organicPetModel2 = new OrganicPetModel("Julie", PetTypeEnums.CAT, null, "Egyptian", 1,
        //         PetHeathEnums.HEALTHY, PetMoodEnums.CALM, TempermentEnums.CAREFREE, AdoptionsStatusEnum.APPROVED,
        //         "no notes");
        // organicPetModel2.setId(2l);

        // OrganicPetModel organicPetModel3 = new OrganicPetModel("James", PetTypeEnums.DOG, null, "Lab", 4,
        //         PetHeathEnums.HUNGRY, PetMoodEnums.DEPRESSED, TempermentEnums.ACTIVE, AdoptionsStatusEnum.REQUESTED,
        //         "no notes");
        // organicPetModel3.setId(3l);

        // PetMaintenanceModel petMaintenanceModel = new PetMaintenanceModel("Clean Dog Pin", 4, 
        // PetTypeEnums.DOG, PetTaskEnums.CLEAN_ENCLOSURE);
        // petMaintenanceModel.setId(1l);

        // RoboticPetModel roboticPetModel = new RoboticPetModel("Robo", PetTypeEnums.ROBOTIC_DOG, "imageUrl", "Hall",
        //         "Intel",
        //         95, 75, RoboticPetEnums.NORMAL, "null", "null");
        // roboticPetModel.setId(1l);

        // RoboticPetModel roboticPetModel2 = new RoboticPetModel("DIgo", PetTypeEnums.ROBOTIC_CAT, "imageUrl", "Hall",
        //         "Intel",
        //         65, 85, RoboticPetEnums.NORMAL, "Null", "Null");
        // roboticPetModel2.setId(2l);

        // RoboticPetModel roboticPetModel3 = new RoboticPetModel("CROWO", PetTypeEnums.ROBOTIC_DOG, "imageUrl", "Jona",
        //         "Google",
        //         35, 55, RoboticPetEnums.LOW_BATTERY, "Null", "Null");
        // roboticPetModel3.setId(3l);

        // VolunteersModel volunteersModel = new VolunteersModel("Micah", "4353 Silver Drive", "", "Cambridge", "OH",
        //         "43523", "6142260693", "JTurner@gmail.com", "imageURL");
        // volunteersModel.setId(1l);

        // VolunteersModel volunteersModel2 = new VolunteersModel("Meel", "2441 Whisper creek Drive", "", "Delawear", "OH",
        //         "43533", "6142274733", "MeelTurner@hotmail.com", "imageURL");
        // volunteersModel2.setId(2l);

        // VolunteersModel volunteersModel3 = new VolunteersModel("Chay", "2342 James Rd", "", "Dayton", "OH", "44333",
        //         "7408434934", "chayhall@icloud.com", "imageURL");
        // volunteersModel3.setId(3l);

    }
}
