package com.flipkart.foxtrot.common.stats;

import com.flipkart.foxtrot.common.ActionRequest;
import com.flipkart.foxtrot.common.Opcodes;
import com.flipkart.foxtrot.common.Period;
import com.flipkart.foxtrot.common.query.Filter;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.List;
import java.util.Set;

/**
 * Created by rishabh.goyal on 02/08/14.
 */
public class StatsTrendRequest extends ActionRequest {

    private String table;

    private String field;

    private List<String> nesting;

    private Set<Stat> stats;

    private List<Double> percentiles;

    private Period period = Period.hours;

    private String timestamp = "_timestamp";

    public StatsTrendRequest() {
        super(Opcodes.STATS_TREND);
    }

    public StatsTrendRequest(List<Filter> filters, String table, String field,
                             Set<Stat> stats,
                             List<String> nesting,
                             List<Double> percentiles,
                             Period period,
                             String timestamp) {
        super(Opcodes.STATS_TREND, filters);
        this.table = table;
        this.field = field;
        this.nesting = nesting;
        this.stats = stats;
        this.percentiles = percentiles;
        this.period = period;
        this.timestamp = timestamp;
    }

    public String getTable() {
        return table;
    }

    public void setTable(String table) {
        this.table = table;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public List<String> getNesting() {
        return nesting;
    }

    public void setNesting(List<String> nesting) {
        this.nesting = nesting;
    }

    public Period getPeriod() {
        return period;
    }

    public void setPeriod(Period period) {
        this.period = period;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public List<Double> getPercentiles() {
        return percentiles;
    }

    public void setPercentiles(List<Double> percentiles) {
        this.percentiles = percentiles;
    }

    public Set<Stat> getStats() {
        return stats;
    }

    public void setStats(Set<Stat> stats) {
        this.stats = stats;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).appendSuper(super.toString())
                .append("table", table)
                .append("field", field)
                .append("nesting", nesting)
                .append("stats", stats)
                .append("percentiles", percentiles)
                .append("period", period)
                .append("timestamp", timestamp)
                .toString();
    }
}
