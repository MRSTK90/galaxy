package kr.co.galaxy.core.domain.ticket;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.UuidGenerator;

import java.util.UUID;

@Getter
@Entity
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Long id;

    @UuidGenerator(style = UuidGenerator.Style.TIME)
    @Column(name = "TID", columnDefinition = "BINARY(16)", nullable = false)
    private UUID tid;

    @Column(name = "TYPE", nullable = false)
    private String type;

    @ColumnDefault("0")
    @Column(name = "COUNT", nullable = false)
    private int count;


    @Builder
    public Ticket(UUID tid, String type, int count){
        this.tid = tid;
        this.type = type;
        this.count = count;
    }

    public void update(int count){
        this.count = count;
    }
}
