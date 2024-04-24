package oslomet.oblig3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TicketRepository {
    @Autowired
    private JdbcTemplate db;

    public void saveTicket(Ticket newTicket){
        String sql = "INSERT INTO ticket (film, amount, fName, sName, phoneNumber, email) VALUES(?,?,?,?,?,?)";
        db.update(sql, newTicket.getFilm(),newTicket.getAmount(), newTicket.getfName(), newTicket.getsName(), newTicket.phoneNumber, newTicket.getEpost());
    }

    public List<Ticket> getTickets(){
        String sql = "SELECT * FROM ticket";
        List<Ticket>allTickets = db.query(sql, new BeanPropertyRowMapper<>(Ticket.class));
                //USIKKER PÅ <> etter BeanPropertyMapper
        return allTickets;
    }

    public void deleteAll(){
        String sql = "DELETE FROM ticket";
        db.update(sql);
    }
}
