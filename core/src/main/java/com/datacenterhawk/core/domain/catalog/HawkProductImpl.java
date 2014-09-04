package com.datacenterhawk.core.domain.catalog;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import org.broadleafcommerce.common.presentation.AdminPresentation;
import org.broadleafcommerce.common.presentation.client.SupportedFieldType;
import org.broadleafcommerce.core.catalog.domain.ProductImpl;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name="HAWK_BLC_PRODUCT")
public class HawkProductImpl extends ProductImpl implements HawkProduct {

    private static final long serialVersionUID = 3052132327589062738L;
    
    @Column(name="LATITUDE", precision = 19, scale = 15)
    @AdminPresentation(friendlyName = "Latitude",
        tab = Presentation.Tab.Name.Advanced, tabOrder = Presentation.Tab.Order.Advanced,
        group = Presentation.Group.Name.Advanced, groupOrder = Presentation.Group.Order.Advanced,
        fieldType = SupportedFieldType.DECIMAL)
    protected BigDecimal latitude;
    
    @Column(name="LONGITUDE", precision = 19, scale = 15)
    @AdminPresentation(friendlyName = "Longitude",
        tab = Presentation.Tab.Name.Advanced, tabOrder = Presentation.Tab.Order.Advanced,
        group = Presentation.Group.Name.Advanced, groupOrder = Presentation.Group.Order.Advanced,
        fieldType = SupportedFieldType.DECIMAL)
    protected BigDecimal longitude;

    @Override
    public BigDecimal getLatitude() {
        return latitude;
    }

    @Override
    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    @Override
    public BigDecimal getLongitude() {
        return longitude;
    }

    @Override
    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

    @Override
    public String getCoordinates() {
    	return latitude.toPlainString() + "," + longitude.toPlainString();
    }

}
