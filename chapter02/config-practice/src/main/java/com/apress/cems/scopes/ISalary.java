package com.apress.cems.scopes;

/**
 * This interface is required to use the JDK interface based proxying for the Salary bean.
 *
 * @see Salary
 */
public interface ISalary {
    public Integer getAmount();
}
