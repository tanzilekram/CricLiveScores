package api.CricLiveScores.Controller;

import api.CricLiveScores.Service.MatchService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/match")
@CrossOrigin("*")
public class CricketController {

    private MatchService matchService;

    public CricketController(MatchService matchService) {
        this.matchService = matchService;
    }

    @GetMapping("/live")
    public ResponseEntity<?> getLiveMatchScores() throws InterruptedException {
        System.out.println("getting live match");
        return new ResponseEntity<>(this.matchService.getLiveMatchScores(), HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<?> getAllMatches()  throws InterruptedException{
        System.out.println("getting all matches");
        return new ResponseEntity<>(this.matchService.getAllMatches(),HttpStatus.OK);
    }

    @GetMapping("/points-table")
    public ResponseEntity<?> getCWC2023PointTable() {
        return new ResponseEntity<>(this.matchService.getCWC2023PointTable(), HttpStatus.OK);
    }

    @GetMapping("/live-news")
    public ResponseEntity<?> getSideBarNews() {
        return new ResponseEntity<>(this.matchService.getSideBarNews(), HttpStatus.OK);
    }

}
