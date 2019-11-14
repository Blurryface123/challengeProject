
package com.andres.entity.dota2;

import com.fasterxml.jackson.annotation.*;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "account_id",
        "player_slot",
        "hero_id"
})
@Embeddable
public class Player implements Serializable
{

    @Id
    @JsonProperty("account_id")
    @Column(name = "account_id")
    private Long accountId;

    @Column(name = "player_slot")
    @JsonProperty("player_slot")
    private Integer playerSlot;

    @Id
    @Column(name = "hero_id")
    @JsonProperty("hero_id")
    private Integer heroId;
    @JsonIgnore
    @Transient
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -5426366567460333099L;

    /**
     * No args constructor for use in serialization
     *
     */
    public Player() {
    }

    /**
     *
     * @param accountId
     * @param playerSlot
     * @param heroId
     */
    public Player(Long accountId, Integer playerSlot, Integer heroId) {
        super();
        this.accountId = accountId;
        this.playerSlot = playerSlot;
        this.heroId = heroId;
    }

    @JsonProperty("account_id")
    public Long getAccountId() {
        return accountId;
    }

    @JsonProperty("account_id")
    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    @JsonProperty("player_slot")
    public Integer getPlayerSlot() {
        return playerSlot;
    }

    @JsonProperty("player_slot")
    public void setPlayerSlot(Integer playerSlot) {
        this.playerSlot = playerSlot;
    }

    @JsonProperty("hero_id")
    public Integer getHeroId() {
        return heroId;
    }

    @JsonProperty("hero_id")
    public void setHeroId(Integer heroId) {
        this.heroId = heroId;
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
        return new ToStringBuilder(this).append("accountId", accountId).append("playerSlot", playerSlot).append("heroId", heroId).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(accountId).append(heroId).append(additionalProperties).append(playerSlot).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Player) == false) {
            return false;
        }
        Player rhs = ((Player) other);
        return new EqualsBuilder().append(accountId, rhs.accountId).append(heroId, rhs.heroId).append(additionalProperties, rhs.additionalProperties).append(playerSlot, rhs.playerSlot).isEquals();
    }

}
