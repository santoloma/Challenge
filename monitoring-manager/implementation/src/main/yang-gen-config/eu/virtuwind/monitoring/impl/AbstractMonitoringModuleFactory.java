/*
* Generated file
*
* Generated from: yang module name: monitoring-impl yang module local name: monitoring-impl
* Generated by: org.opendaylight.controller.config.yangjmxgenerator.plugin.JMXGenerator
* Generated at: Fri Jul 14 00:33:28 BST 2017
*
* Do not modify this file unless it is present under src/main directory
*/
package eu.virtuwind.monitoring.impl;
@org.opendaylight.yangtools.yang.binding.annotations.ModuleQName(namespace = "urn:eu:virtuwind:monitoring:impl", name = "monitoring-impl", revision = "2015-07-22")

public abstract class AbstractMonitoringModuleFactory implements org.opendaylight.controller.config.spi.ModuleFactory {
    public static final java.lang.String NAME = "monitoring-impl";

    private static final java.util.Set<Class<? extends org.opendaylight.controller.config.api.annotations.AbstractServiceInterface>> serviceIfcs;

    @Override
    public final String getImplementationName() {
        return NAME;
    }

    static {
        serviceIfcs = java.util.Collections.emptySet();
    }

    @Override
    public final boolean isModuleImplementingServiceInterface(Class<? extends org.opendaylight.controller.config.api.annotations.AbstractServiceInterface> serviceInterface) {
        for (Class<?> ifc: serviceIfcs) {
            if (serviceInterface.isAssignableFrom(ifc)){
                return true;
            }
        }
        return false;
    }

    @Override
    public java.util.Set<Class<? extends org.opendaylight.controller.config.api.annotations.AbstractServiceInterface>> getImplementedServiceIntefaces() {
        return serviceIfcs;
    }

    @Override
    public org.opendaylight.controller.config.spi.Module createModule(String instanceName, org.opendaylight.controller.config.api.DependencyResolver dependencyResolver, org.osgi.framework.BundleContext bundleContext) {
        return instantiateModule(instanceName, dependencyResolver, bundleContext);
    }

    @Override
    public org.opendaylight.controller.config.spi.Module createModule(String instanceName, org.opendaylight.controller.config.api.DependencyResolver dependencyResolver, org.opendaylight.controller.config.api.DynamicMBeanWithInstance old, org.osgi.framework.BundleContext bundleContext) throws Exception {
        eu.virtuwind.monitoring.impl.MonitoringModule oldModule;
        try {
            oldModule = (eu.virtuwind.monitoring.impl.MonitoringModule) old.getModule();
        } catch(Exception e) {
            return handleChangedClass(old);
        }
        eu.virtuwind.monitoring.impl.MonitoringModule module = instantiateModule(instanceName, dependencyResolver, oldModule, old.getInstance(), bundleContext);
        module.setRpcRegistry(oldModule.getRpcRegistry());
        module.setDataBroker(oldModule.getDataBroker());
        module.setNotificationService(oldModule.getNotificationService());

        return module;
    }

    public eu.virtuwind.monitoring.impl.MonitoringModule instantiateModule(String instanceName, org.opendaylight.controller.config.api.DependencyResolver dependencyResolver, eu.virtuwind.monitoring.impl.MonitoringModule oldModule, java.lang.AutoCloseable oldInstance, org.osgi.framework.BundleContext bundleContext) {
        return new eu.virtuwind.monitoring.impl.MonitoringModule(new org.opendaylight.controller.config.api.ModuleIdentifier(NAME, instanceName), dependencyResolver, oldModule, oldInstance);
    }

    public eu.virtuwind.monitoring.impl.MonitoringModule instantiateModule(String instanceName, org.opendaylight.controller.config.api.DependencyResolver dependencyResolver, org.osgi.framework.BundleContext bundleContext) {
        return new eu.virtuwind.monitoring.impl.MonitoringModule(new org.opendaylight.controller.config.api.ModuleIdentifier(NAME, instanceName), dependencyResolver);
    }

    public eu.virtuwind.monitoring.impl.MonitoringModule handleChangedClass(org.opendaylight.controller.config.api.DynamicMBeanWithInstance old) throws Exception {
        throw new UnsupportedOperationException("Class reloading is not supported");
    }

    @Override
    public java.util.Set<eu.virtuwind.monitoring.impl.MonitoringModule> getDefaultModules(org.opendaylight.controller.config.api.DependencyResolverFactory dependencyResolverFactory, org.osgi.framework.BundleContext bundleContext) {
        return new java.util.HashSet<eu.virtuwind.monitoring.impl.MonitoringModule>();
    }

}
