package com.andres.entity.dota2;

import com.fasterxml.jackson.annotation.*;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "match_id",
        "match_seq_num",
        "start_time",
        "lobby_type",
        "radiant_team_id",
        "dire_team_id",
        "players"
})
@Embeddable
public class Match implements Serializable
{

    @Id
    @Column(name = "match_id")
    @JsonProperty("match_id")
    private Long matchId;

    @Column(name = "match_seq_num")
    @JsonProperty("match_seq_num")
    private Long matchSeqNum;

    @Column(name = "start_time")
    @JsonProperty("start_time")
    private Long startTime;

    @Column(name = "lobby_type")
    @JsonProperty("lobby_type")
    private Long lobbyType;

    @Column(name = "radiant_team_id")
    @JsonProperty("radiant_team_id")
    private Long radiantTeamId;

    @Column(name = "dire_team_id")
    @JsonProperty("dire_team_id")
    private Long direTeamId;

    @Embedded
    @JsonProperty("players")
    private List<Player> players = null;
    @JsonIgnore
    @Transient
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 1153656512753727783L;

    /**
     * No args constructor for use in serialization
     *
     */
    public Match() {
    }

    /**
     *  @param matchId
     * @param matchSeqNum
     * @param startTime
     * @param lobbyType
     * @param radiantTeamId
     * @param direTeamId
     * @param players
     */
    public Match(Long matchId, Long matchSeqNum, Long startTime, Long lobbyType, Long radiantTeamId, Long direTeamId, List<Player> players) {
        super();
        this.matchId = matchId;
        this.matchSeqNum = matchSeqNum;
        this.startTime = startTime;
        this.lobbyType = lobbyType;
        this.radiantTeamId = radiantTeamId;
        this.direTeamId = direTeamId;
        this.players = players;
    }

    @JsonProperty("match_id")
    public Long getMatchId() {
        return matchId;
    }

    @JsonProperty("match_id")
    public void setMatchId(Long matchId) {
        this.matchId = matchId;
    }

    @JsonProperty("match_seq_num")
    public Long getMatchSeqNum() {
        return matchSeqNum;
    }

    @JsonProperty("match_seq_num")
    public void setMatchSeqNum(Long matchSeqNum) {
        this.matchSeqNum = matchSeqNum;
    }

    @JsonProperty("start_time")
    public Long getStartTime() {
        return startTime;
    }

    @JsonProperty("start_time")
    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    @JsonProperty("lobby_type")
    public Long getLobbyType() {
        return lobbyType;
    }

    @JsonProperty("lobby_type")
    public void setLobbyType(Long lobbyType) {
        this.lobbyType = lobbyType;
    }

    @JsonProperty("radiant_team_id")
    public Long getRadiantTeamId() {
        return radiantTeamId;
    }

    @JsonProperty("radiant_team_id")
    public void setRadiantTeamId(Long radiantTeamId) {
        this.radiantTeamId = radiantTeamId;
    }

    @JsonProperty("dire_team_id")
    public Long getDireTeamId() {
        return direTeamId;
    }

    @JsonProperty("dire_team_id")
    public void setDireTeamId(Long direTeamId) {
        this.direTeamId = direTeamId;
    }

    @JsonProperty("players")
    public List<Player> getPlayers() {
        return players;
    }

    @JsonProperty("players")
    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("matchId", matchId).append("matchSeqNum", matchSeqNum).append("startTime", startTime).append("lobbyType", lobbyType).append("radiantTeamId", radiantTeamId).append("direTeamId", direTeamId).append("players", players).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(lobbyType).append(direTeamId).append(matchSeqNum).append(players).append(startTime).append(additionalProperties).append(matchId).append(radiantTeamId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Match) == false) {
            return false;
        }
        Match rhs = ((Match) other);
        return new EqualsBuilder().append(lobbyType, rhs.lobbyType).append(direTeamId, rhs.direTeamId).append(matchSeqNum, rhs.matchSeqNum).append(players, rhs.players).append(startTime, rhs.startTime).append(additionalProperties, rhs.additionalProperties).append(matchId, rhs.matchId).append(radiantTeamId, rhs.radiantTeamId).isEquals();
    }

}
/*

package com.andres.apiConsumption.entity.dota2;

import com.fasterxml.jackson.annotation.*;
import lombok.EqualsAndHashCode;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.persistence.*;
import java.io.Serializable;
import java.util.*;

@Entity
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "match_id",
    "match_seq_num",
    "start_time",
    "lobby_type",
    "radiant_team_id",
    "dire_team_id",
    "players"
})
public class Match implements Serializable
{

    @Id
    @Column(name = "match_id")
    @JsonProperty("match_id")
    private Long matchId;

    @Column(name = "match_seq_num")
    @JsonProperty("match_seq_num")
    private Long matchSeqNum;

    @Column(name = "start_time")
    @JsonProperty("start_time")
    private Long startTime;

    @Column(name = "lobby_type")
    @JsonProperty("lobby_type")
    private Long lobbyType;

    @Column(name = "radiant_team_id")
    @JsonProperty("radiant_team_id")
    private Long radiantTeamId;

    @Column(name = "dire_team_id")
    @JsonProperty("dire_team_id")
    private Long direTeamId;

    @ManyToOne
    @JoinColumn(name = "result_fk")
    private Result result;




    /*@OneToMany(mappedBy = "match", fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JsonProperty("players")
    private Set<Player> players= new HashSet<>();*/



/*

    /**
     * No args constructor for use in serialization
     *
     *
    public Match() {
    }

    /**
     *  @param matchId
     * @param matchSeqNum
     * @param startTime
     * @param lobbyType
     * @param radiantTeamId
     * @param direTeamId
     * @param
     *
    public Match(Long matchId, Long matchSeqNum, Long startTime, Long lobbyType, Long radiantTeamId, Long direTeamId,Result result) {
        super();
        this.matchId = matchId;
        this.matchSeqNum = matchSeqNum;
        this.startTime = startTime;
        this.lobbyType = lobbyType;
        this.radiantTeamId = radiantTeamId;
        this.direTeamId = direTeamId;
        this.result = result;
        //this.players = players;
    }


    public Long getMatchId() {
        return matchId;
    }

    public void setMatchId(Long matchId) {
        this.matchId = matchId;
    }


    public Long getMatchSeqNum() {
        return matchSeqNum;
    }

    public void setMatchSeqNum(Long matchSeqNum) {
        this.matchSeqNum = matchSeqNum;
    }


    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }


    public Long getLobbyType() {
        return lobbyType;
    }

    public void setLobbyType(Long lobbyType) {
        this.lobbyType = lobbyType;
    }


    public Long getRadiantTeamId() {
        return radiantTeamId;
    }

    public void setRadiantTeamId(Long radiantTeamId) {
        this.radiantTeamId = radiantTeamId;
    }


    public Long getDireTeamId() {
        return direTeamId;
    }

    public void setDireTeamId(Long direTeamId) {
        this.direTeamId = direTeamId;
    }


    public Result getResult() {
        return result;
    }

    private void setResult(Result result) {
        this.result = result;
    }
*/

    /*@JsonProperty("players")
    public Set<Player> getPlayers() {
        return players;
    }

    @JsonProperty("players")
    public void setPlayers(Set<Player> players) {
        this.players = players;
    }*/
    /*
    public String toString() {
        return new ToStringBuilder(this).append("matchId", matchId).append("matchSeqNum", matchSeqNum).append("startTime", startTime).append("lobbyType", lobbyType).append("radiantTeamId", radiantTeamId).append("direTeamId", direTeamId).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(lobbyType).append(direTeamId).append(matchSeqNum).append(startTime).append(matchId).append(radiantTeamId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Match) == false) {
            return false;
        }
        Match rhs = ((Match) other);
        return new EqualsBuilder().append(lobbyType, rhs.lobbyType).append(direTeamId, rhs.direTeamId).append(matchSeqNum, rhs.matchSeqNum).append(startTime, rhs.startTime).append(matchId, rhs.matchId).append(radiantTeamId, rhs.radiantTeamId).isEquals();
    }

}


 */