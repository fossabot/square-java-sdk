package com.squareup.square.models;

import java.util.List;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonGetter;


/**
 * This is a model class for CatalogPricingRule type.
 */
public class CatalogPricingRule {

    /**
     * Initialization constructor.
     * @param name
     * @param timePeriodIds
     * @param discountId
     * @param matchProductsId
     * @param applyProductsId
     * @param excludeProductsId
     * @param validFromDate
     * @param validFromLocalTime
     * @param validUntilDate
     * @param validUntilLocalTime
     * @param excludeStrategy
     */
    @JsonCreator
    public CatalogPricingRule(
            @JsonProperty("name") String name,
            @JsonProperty("time_period_ids") List<String> timePeriodIds,
            @JsonProperty("discount_id") String discountId,
            @JsonProperty("match_products_id") String matchProductsId,
            @JsonProperty("apply_products_id") String applyProductsId,
            @JsonProperty("exclude_products_id") String excludeProductsId,
            @JsonProperty("valid_from_date") String validFromDate,
            @JsonProperty("valid_from_local_time") String validFromLocalTime,
            @JsonProperty("valid_until_date") String validUntilDate,
            @JsonProperty("valid_until_local_time") String validUntilLocalTime,
            @JsonProperty("exclude_strategy") String excludeStrategy) {
        this.name = name;
        this.timePeriodIds = timePeriodIds;
        this.discountId = discountId;
        this.matchProductsId = matchProductsId;
        this.applyProductsId = applyProductsId;
        this.excludeProductsId = excludeProductsId;
        this.validFromDate = validFromDate;
        this.validFromLocalTime = validFromLocalTime;
        this.validUntilDate = validUntilDate;
        this.validUntilLocalTime = validUntilLocalTime;
        this.excludeStrategy = excludeStrategy;
    }

    private final String name;
    private final List<String> timePeriodIds;
    private final String discountId;
    private final String matchProductsId;
    private final String applyProductsId;
    private final String excludeProductsId;
    private final String validFromDate;
    private final String validFromLocalTime;
    private final String validUntilDate;
    private final String validUntilLocalTime;
    private final String excludeStrategy;
    /**
     * Getter for Name.
     * User-defined name for the pricing rule. For example, "Buy one get one
     * free" or "10% off".
     */
    @JsonGetter("name")
    public String getName() {
        return this.name;
    }

    /**
     * Getter for TimePeriodIds.
     * A list of unique IDs for the catalog time periods when
     * this pricing rule is in effect. If left unset, the pricing rule is always
     * in effect.
     */
    @JsonGetter("time_period_ids")
    public List<String> getTimePeriodIds() {
        return this.timePeriodIds;
    }

    /**
     * Getter for DiscountId.
     * Unique ID for the `CatalogDiscount` to take off
     * the price of all matched items.
     */
    @JsonGetter("discount_id")
    public String getDiscountId() {
        return this.discountId;
    }

    /**
     * Getter for MatchProductsId.
     * Unique ID for the `CatalogProductSet` that will be matched by this rule.
     * A match rule matches within the entire cart.
     * A match rule can match multiple times in the cart.
     * If no `ProductSet` is present, the rule will match all products.
     */
    @JsonGetter("match_products_id")
    public String getMatchProductsId() {
        return this.matchProductsId;
    }

    /**
     * Getter for ApplyProductsId.
     * __Deprecated__: Please use the `exclude_products_id` field to apply
     * an exclude set instead. Exclude sets allow better control over quantity
     * ranges and offer more flexibility for which matched items receive a discount.
     * `CatalogProductSet` to apply the pricing to.
     * An apply rule matches within the subset of the cart that fits the match rules (the match set).
     * An apply rule can only match once in the match set.
     * If not supplied, the pricing will be applied to all products in the match set.
     * Other products retain their base price, or a price generated by other rules.
     */
    @JsonGetter("apply_products_id")
    public String getApplyProductsId() {
        return this.applyProductsId;
    }

    /**
     * Getter for ExcludeProductsId.
     * `CatalogProductSet` to exclude from the pricing rule.
     * An exclude rule matches within the subset of the cart that fits the match rules (the match set).
     * An exclude rule can only match once in the match set.
     * If not supplied, the pricing will be applied to all products in the match set.
     * Other products retain their base price, or a price generated by other rules.
     */
    @JsonGetter("exclude_products_id")
    public String getExcludeProductsId() {
        return this.excludeProductsId;
    }

    /**
     * Getter for ValidFromDate.
     * Represents the date the Pricing Rule is valid from. Represented in RFC3339 full-date format (YYYY-MM-DD).
     */
    @JsonGetter("valid_from_date")
    public String getValidFromDate() {
        return this.validFromDate;
    }

    /**
     * Getter for ValidFromLocalTime.
     * Represents the local time the pricing rule should be valid from. Represented in RFC3339 partial-time format
     * (HH:MM:SS). Partial seconds will be truncated.
     */
    @JsonGetter("valid_from_local_time")
    public String getValidFromLocalTime() {
        return this.validFromLocalTime;
    }

    /**
     * Getter for ValidUntilDate.
     * Represents the date the Pricing Rule is valid until. Represented in RFC3339 full-date format (YYYY-MM-DD).
     */
    @JsonGetter("valid_until_date")
    public String getValidUntilDate() {
        return this.validUntilDate;
    }

    /**
     * Getter for ValidUntilLocalTime.
     * Represents the local time the pricing rule should be valid until. Represented in RFC3339 partial-time format
     * (HH:MM:SS). Partial seconds will be truncated.
     */
    @JsonGetter("valid_until_local_time")
    public String getValidUntilLocalTime() {
        return this.validUntilLocalTime;
    }

    /**
     * Getter for ExcludeStrategy.
     * Indicates which products matched by a CatalogPricingRule
     * will be excluded if the pricing rule uses an exclude set.
     */
    @JsonGetter("exclude_strategy")
    public String getExcludeStrategy() {
        return this.excludeStrategy;
    }

 
    @Override
    public int hashCode() {
        return Objects.hash(name, timePeriodIds, discountId, matchProductsId, applyProductsId,
            excludeProductsId, validFromDate, validFromLocalTime, validUntilDate,
            validUntilLocalTime, excludeStrategy);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this) {
            return true;
        }
        if(!(obj instanceof CatalogPricingRule)) {
            return false;
        }
        CatalogPricingRule catalogPricingRule = (CatalogPricingRule) obj;
        return Objects.equals(name, catalogPricingRule.name) &&
            Objects.equals(timePeriodIds, catalogPricingRule.timePeriodIds) &&
            Objects.equals(discountId, catalogPricingRule.discountId) &&
            Objects.equals(matchProductsId, catalogPricingRule.matchProductsId) &&
            Objects.equals(applyProductsId, catalogPricingRule.applyProductsId) &&
            Objects.equals(excludeProductsId, catalogPricingRule.excludeProductsId) &&
            Objects.equals(validFromDate, catalogPricingRule.validFromDate) &&
            Objects.equals(validFromLocalTime, catalogPricingRule.validFromLocalTime) &&
            Objects.equals(validUntilDate, catalogPricingRule.validUntilDate) &&
            Objects.equals(validUntilLocalTime, catalogPricingRule.validUntilLocalTime) &&
            Objects.equals(excludeStrategy, catalogPricingRule.excludeStrategy);
    }

    /**
     * Builds a new {@link CatalogPricingRule.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CatalogPricingRule.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
            .name(getName())
            .timePeriodIds(getTimePeriodIds())
            .discountId(getDiscountId())
            .matchProductsId(getMatchProductsId())
            .applyProductsId(getApplyProductsId())
            .excludeProductsId(getExcludeProductsId())
            .validFromDate(getValidFromDate())
            .validFromLocalTime(getValidFromLocalTime())
            .validUntilDate(getValidUntilDate())
            .validUntilLocalTime(getValidUntilLocalTime())
            .excludeStrategy(getExcludeStrategy());
            return builder;
    }

    /**
     * Class to build instances of {@link CatalogPricingRule}
     */
    public static class Builder {
        private String name;
        private List<String> timePeriodIds;
        private String discountId;
        private String matchProductsId;
        private String applyProductsId;
        private String excludeProductsId;
        private String validFromDate;
        private String validFromLocalTime;
        private String validUntilDate;
        private String validUntilLocalTime;
        private String excludeStrategy;

        /**
         * Initialization constructor
         */
        public Builder() {
           
        }

        /**
         * Setter for name
         * @param name
         * @return Builder
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }
        /**
         * Setter for timePeriodIds
         * @param timePeriodIds
         * @return Builder
         */
        public Builder timePeriodIds(List<String> timePeriodIds) {
            this.timePeriodIds = timePeriodIds;
            return this;
        }
        /**
         * Setter for discountId
         * @param discountId
         * @return Builder
         */
        public Builder discountId(String discountId) {
            this.discountId = discountId;
            return this;
        }
        /**
         * Setter for matchProductsId
         * @param matchProductsId
         * @return Builder
         */
        public Builder matchProductsId(String matchProductsId) {
            this.matchProductsId = matchProductsId;
            return this;
        }
        /**
         * Setter for applyProductsId
         * @param applyProductsId
         * @return Builder
         */
        public Builder applyProductsId(String applyProductsId) {
            this.applyProductsId = applyProductsId;
            return this;
        }
        /**
         * Setter for excludeProductsId
         * @param excludeProductsId
         * @return Builder
         */
        public Builder excludeProductsId(String excludeProductsId) {
            this.excludeProductsId = excludeProductsId;
            return this;
        }
        /**
         * Setter for validFromDate
         * @param validFromDate
         * @return Builder
         */
        public Builder validFromDate(String validFromDate) {
            this.validFromDate = validFromDate;
            return this;
        }
        /**
         * Setter for validFromLocalTime
         * @param validFromLocalTime
         * @return Builder
         */
        public Builder validFromLocalTime(String validFromLocalTime) {
            this.validFromLocalTime = validFromLocalTime;
            return this;
        }
        /**
         * Setter for validUntilDate
         * @param validUntilDate
         * @return Builder
         */
        public Builder validUntilDate(String validUntilDate) {
            this.validUntilDate = validUntilDate;
            return this;
        }
        /**
         * Setter for validUntilLocalTime
         * @param validUntilLocalTime
         * @return Builder
         */
        public Builder validUntilLocalTime(String validUntilLocalTime) {
            this.validUntilLocalTime = validUntilLocalTime;
            return this;
        }
        /**
         * Setter for excludeStrategy
         * @param excludeStrategy
         * @return Builder
         */
        public Builder excludeStrategy(String excludeStrategy) {
            this.excludeStrategy = excludeStrategy;
            return this;
        }

        /**
         * Builds a new {@link CatalogPricingRule} object using the set fields.
         * @return {@link CatalogPricingRule}
         */
        public CatalogPricingRule build() {
            return new CatalogPricingRule(name,
                timePeriodIds,
                discountId,
                matchProductsId,
                applyProductsId,
                excludeProductsId,
                validFromDate,
                validFromLocalTime,
                validUntilDate,
                validUntilLocalTime,
                excludeStrategy);
        }
    }
}
