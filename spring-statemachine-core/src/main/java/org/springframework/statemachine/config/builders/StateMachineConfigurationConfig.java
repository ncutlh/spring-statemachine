/*
 * Copyright 2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.statemachine.config.builders;

import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.core.task.TaskExecutor;
import org.springframework.scheduling.TaskScheduler;
import org.springframework.security.access.AccessDecisionManager;
import org.springframework.statemachine.ensemble.StateMachineEnsemble;
import org.springframework.statemachine.listener.StateMachineListener;
import org.springframework.statemachine.security.SecurityRule;

/**
 * Configuration object used to keep things together in {@link StateMachineConfigurationBuilder}.
 *
 * @author Janne Valkealahti
 *
 * @param <S> the type of state
 * @param <E> the type of event
 */
public class StateMachineConfigurationConfig<S, E> {

	private final BeanFactory beanFactory;
	private final TaskExecutor taskExecutor;
	private final TaskScheduler taskScheduler;
	private final boolean autoStart;
	private final StateMachineEnsemble<S, E> ensemble;
	private final List<StateMachineListener<S, E>> listeners;
	private final boolean securityEnabled;
	private final AccessDecisionManager transitionSecurityAccessDecisionManager;
	private final AccessDecisionManager eventSecurityAccessDecisionManager;
	private final SecurityRule eventSecurityRule;
	private final SecurityRule transitionSecurityRule;

	/**
	 * Instantiates a new state machine configuration config.
	 *
	 * @param beanFactory the bean factory
	 * @param taskExecutor the task executor
	 * @param taskScheduler the task scheduler
	 * @param autoStart the autostart flag
	 * @param ensemble the state machine ensemble
	 * @param listeners the state machine listeners
	 * @param securityEnabled the security enabled flag
	 * @param transitionSecurityAccessDecisionManager the transition security access decision manager
	 * @param eventSecurityAccessDecisionManager the event security access decision manager
	 * @param eventSecurityRule the event security rule
	 * @param transitionSecurityRule the transition security rule
	 */
	public StateMachineConfigurationConfig(BeanFactory beanFactory, TaskExecutor taskExecutor,
			TaskScheduler taskScheduler, boolean autoStart, StateMachineEnsemble<S, E> ensemble,
			List<StateMachineListener<S, E>> listeners, boolean securityEnabled,
			AccessDecisionManager transitionSecurityAccessDecisionManager, AccessDecisionManager eventSecurityAccessDecisionManager,
			SecurityRule eventSecurityRule, SecurityRule transitionSecurityRule) {
		this.beanFactory = beanFactory;
		this.taskExecutor = taskExecutor;
		this.taskScheduler = taskScheduler;
		this.autoStart = autoStart;
		this.ensemble = ensemble;
		this.listeners = listeners;
		this.securityEnabled = securityEnabled;
		this.transitionSecurityAccessDecisionManager = transitionSecurityAccessDecisionManager;
		this.eventSecurityAccessDecisionManager = eventSecurityAccessDecisionManager;
		this.eventSecurityRule = eventSecurityRule;
		this.transitionSecurityRule = transitionSecurityRule;
	}

	/**
	 * Gets the bean factory.
	 *
	 * @return the bean factory
	 */
	public BeanFactory getBeanFactory() {
		return beanFactory;
	}

	/**
	 * Gets the task executor.
	 *
	 * @return the task executor
	 */
	public TaskExecutor getTaskExecutor() {
		return taskExecutor;
	}

	/**
	 * Gets the task scheduler.
	 *
	 * @return the task scheduler
	 */
	public TaskScheduler getTaskScheduler() {
		return taskScheduler;
	}

	/**
	 * Gets the state machine ensemble.
	 *
	 * @return the state machine ensemble
	 */
	public StateMachineEnsemble<S, E> getStateMachineEnsemble() {
		return ensemble;
	}

	/**
	 * Returns autostart flag.
	 *
	 * @return true, if is autostart is enabled.
	 */
	public boolean isAutoStart() {
		return autoStart;
	}

	/**
	 * Gets the state machine listeners.
	 *
	 * @return the state machine listeners
	 */
	public List<StateMachineListener<S, E>> getStateMachineListeners() {
		return listeners;
	}

	/**
	 * Checks if is security is enabled.
	 *
	 * @return true, if is security is enabled
	 */
	public boolean isSecurityEnabled() {
		return securityEnabled;
	}

	/**
	 * Gets the transition security access decision manager.
	 *
	 * @return the security access decision manager
	 */
	public AccessDecisionManager getTransitionSecurityAccessDecisionManager() {
		return transitionSecurityAccessDecisionManager;
	}

	/**
	 * Gets the event security access decision manager.
	 *
	 * @return the event security access decision manager
	 */
	public AccessDecisionManager getEventSecurityAccessDecisionManager() {
		return eventSecurityAccessDecisionManager;
	}

	/**
	 * Gets the event security rule.
	 *
	 * @return the event security rule
	 */
	public SecurityRule getEventSecurityRule() {
		return eventSecurityRule;
	}

	/**
	 * Gets the transition security rule.
	 *
	 * @return the transition security rule
	 */
	public SecurityRule getTransitionSecurityRule() {
		return transitionSecurityRule;
	}

}
