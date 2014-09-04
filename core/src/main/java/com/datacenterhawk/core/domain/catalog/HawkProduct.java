package com.datacenterhawk.core.domain.catalog;

import java.math.BigDecimal;

public interface HawkProduct {
    
	public BigDecimal getLatitude();
    public void setLatitude(BigDecimal latitude);
    public BigDecimal getLongitude();
    public void setLongitude(BigDecimal longitude);
    public String getCoordinates();

}
