package info.novatec.micronaut.camunda.bpm.feature;

import org.camunda.bpm.engine.ProcessEngineConfiguration;

import javax.annotation.Nonnull;

/**
 * @author Lukasz Frankowski
 */
@FunctionalInterface
public interface ProcessEngineConfigurationCustomizer {

    void customize(@Nonnull ProcessEngineConfiguration configuration);

}
