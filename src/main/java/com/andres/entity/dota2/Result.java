
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
import java.util.UUID;



@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "status",
        "num_results",
        "total_results",
        "results_remaining",
        "matches"
})
@Table(name = "dota_results")
public class Result implements Serializable
{

    @Column(name = "status")
    @JsonProperty("status")
    private Integer status;

    @Column(name = "num_results")
    @JsonProperty("num_results")
    private Integer numResults;

    @Column(name = "total_results")
    @JsonProperty("total_results")
    private Integer totalResults;

    @Column(name = "results_remaining")
    @JsonProperty("results_remaining")
    private Integer resultsRemaining;

    @Embedded
    @JsonProperty("matches")
    private List<Match> matches = null;

    @JsonIgnore
    @Transient
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    @JsonIgnore
    private final static long serialVersionUID = -6800758436730433628L;

    /**
     * No args constructor for use in serialization
     *
     */
    public Result() {
    }

    /**
     *
     * @param totalResults
     * @param resultsRemaining
     * @param numResults
     * @param matches
     * @param status
     */
    public Result(Integer status, Integer numResults, Integer totalResults, Integer resultsRemaining, List<Match> matches) {
        super();
        this.status = status;
        this.numResults = numResults;
        this.totalResults = totalResults;
        this.resultsRemaining = resultsRemaining;
        this.matches = matches;
    }

    @JsonProperty("status")
    public Integer getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(Integer status) {
        this.status = status;
    }

    @JsonProperty("num_results")
    public Integer getNumResults() {
        return numResults;
    }

    @JsonProperty("num_results")
    public void setNumResults(Integer numResults) {
        this.numResults = numResults;
    }

    @JsonProperty("total_results")
    public Integer getTotalResults() {
        return totalResults;
    }

    @JsonProperty("total_results")
    public void setTotalResults(Integer totalResults) {
        this.totalResults = totalResults;
    }

    @JsonProperty("results_remaining")
    public Integer getResultsRemaining() {
        return resultsRemaining;
    }

    @JsonProperty("results_remaining")
    public void setResultsRemaining(Integer resultsRemaining) {
        this.resultsRemaining = resultsRemaining;
    }

    @JsonProperty("matches")
    public List<Match> getMatches() {
        return matches;
    }

    @JsonProperty("matches")
    public void setMatches(List<Match> matches) {
        this.matches = matches;
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
        return new ToStringBuilder(this).append("status", status).append("numResults", numResults).append("totalResults", totalResults).append("resultsRemaining", resultsRemaining).append("matches", matches).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(totalResults).append(resultsRemaining).append(numResults).append(matches).append(status).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Result) == false) {
            return false;
        }
        Result rhs = ((Result) other);
        return new EqualsBuilder().append(totalResults, rhs.totalResults).append(resultsRemaining, rhs.resultsRemaining).append(numResults, rhs.numResults).append(matches, rhs.matches).append(status, rhs.status).isEquals();
    }

}
/*

package com.andres.apiConsumption.entity.dota2;

import com.fasterxml.jackson.annotation.*;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.persistence.*;
import java.io.Serializable;
import java.util.*;


@Entity
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "status",
    "num_results",
    "total_results",
    "results_remaining",
    "matches"
})
public class Result implements Serializable
{
    @Id
    @Column(name = "uuid")
    @JsonProperty("uuid")
    private Long uuid;

    @Column(name = "status")
    @JsonProperty("status")
    private Integer status;

    @Column(name = "num_results")
    @JsonProperty("num_results")
    private Integer numResults;

    @Column(name = "total_results")
    @JsonProperty("total_results")
    private Integer totalResults;

    @Column(name = "results_remaining")
    @JsonProperty("results_remaining")
    private Integer resultsRemaining;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "result_fk")
    @JsonProperty("matches")
    private Set<Match> matches= new HashSet<Match>();







/*
    /**
     * No args constructor for use in serialization
     *
     *
public Result() {
}

    /**
     *
     * @param totalResults
     * @param resultsRemaining
     * @param numResults
     * @param matches
     * @param status
     *
    */
    /*
    public Result(Long uuid, Integer status, Integer numResults, Integer totalResults, Integer resultsRemaining, Set<Match> matches) {
        super();
        this.uuid = uuid;
        this.status = status;
        this.numResults = numResults;
        this.totalResults = totalResults;
        this.resultsRemaining = resultsRemaining;
        this.matches = matches;
    }


    public Long getUuid() {
        return uuid;
    }


    public void setUuid(Long uuid) {
        this.uuid = uuid;
    }


    public Integer getStatus() {
        return status;
    }


    public void setStatus(Integer status) {
        this.status = status;
    }


    public Integer getNumResults() {
        return numResults;
    }


    public void setNumResults(Integer numResults) {
        this.numResults = numResults;
    }


    public Integer getTotalResults() {
        return totalResults;
    }


    public void setTotalResults(Integer totalResults) {
        this.totalResults = totalResults;
    }

    public Integer getResultsRemaining() {
        return resultsRemaining;
    }


    public void setResultsRemaining(Integer resultsRemaining) {
        this.resultsRemaining = resultsRemaining;
    }


    public Set<Match> getMatches() {
        return matches;
    }

    public void setMatches(Set<Match> matches) {
        this.matches = matches;
    }
    /*
        public void addMatch(Match match){
            match.setResult(this);
            this.matches.add(match);
        }*
    @Override
    public String toString() {
        return new ToStringBuilder(this).append("uuid",uuid).append("status", status).append("numResults", numResults).append("totalResults", totalResults).append("resultsRemaining", resultsRemaining).append("matches",matches).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(totalResults).append(resultsRemaining).append(numResults).append(matches).append(status).append(matches).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Result) == false) {
            return false;
        }
        Result rhs = ((Result) other);
        return new EqualsBuilder().append(totalResults, rhs.totalResults).append(resultsRemaining, rhs.resultsRemaining).append(numResults, rhs.numResults).append(matches, rhs.matches).append(status, rhs.status).isEquals();
    }


}

 */