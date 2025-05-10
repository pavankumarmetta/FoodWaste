package klu;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/donations")
@CrossOrigin(origins = "*") // Adjust this for CORS
public class DonationController {

    private final DonationService donationService;

    public DonationController(DonationService donationService) {
        this.donationService = donationService;
    }

    @PostMapping
    public Donation createDonation(@RequestBody Donation donation) {
        return donationService.saveDonation(donation);
    }
}