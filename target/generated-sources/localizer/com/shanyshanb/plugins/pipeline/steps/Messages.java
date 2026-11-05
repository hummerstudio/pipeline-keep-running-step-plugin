// CHECKSTYLE:OFF

package com.shanyshanb.plugins.pipeline.steps;

import org.jvnet.localizer.Localizable;
import org.jvnet.localizer.ResourceBundleHolder;
import org.kohsuke.accmod.Restricted;


/**
 * Generated localization support class.
 * 
 */
@SuppressWarnings({
    "",
    "PMD",
    "all"
})
@Restricted(org.kohsuke.accmod.restrictions.NoExternalUse.class)
public class Messages {

    /**
     * The resource bundle reference
     * 
     */
    private final static ResourceBundleHolder holder = ResourceBundleHolder.get(Messages.class);

    /**
     * Key {@code KeepRunningStep_DescriptorImpl_displayName}: {@code Keep
     * the process running even if the build has finished.}.
     * 
     * @return
     *     {@code Keep the process running even if the build has finished.}
     */
    public static String KeepRunningStep_DescriptorImpl_displayName() {
        return holder.format("KeepRunningStep_DescriptorImpl_displayName");
    }

    /**
     * Key {@code KeepRunningStep_DescriptorImpl_displayName}: {@code Keep
     * the process running even if the build has finished.}.
     * 
     * @return
     *     {@code Keep the process running even if the build has finished.}
     */
    public static Localizable _KeepRunningStep_DescriptorImpl_displayName() {
        return new Localizable(holder, "KeepRunningStep_DescriptorImpl_displayName");
    }

}
