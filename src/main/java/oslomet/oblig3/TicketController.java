package oslomet.oblig3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class TicketController {
//    ArrayList<Ticket>ticketArrayList = new ArrayList<>();

    @Autowired
    private TicketRepository rep;

    @PostMapping ("/registerTicket")
    public void registerTickets(Ticket ticket){
        rep.saveTicket(ticket);
    }
    @GetMapping ("/deleteTickets")
    public void deleteTickets(){
        rep.deleteAll();
    }
    @GetMapping ("/getTicket")
    public List<Ticket> getTicket (){
        return rep.getTickets();
    }

}
