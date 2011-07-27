/**
 * Copyright (c) 2000-2011 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.portal.kernel.workflow;

import java.io.Serializable;

/**
 * @author Michael C. Han
 */
public class WorkflowTaskForm implements Serializable {

	public WorkflowTaskForm(
		long workflowFormId, long formTemplateId) {

		_formTemplateId = formTemplateId;
		_workflowFormId = workflowFormId;
	}

	public long getFormTemplateId() {
		return _formTemplateId;
	}

	public long getWorkflowFormId() {
		return _workflowFormId;
	}

	private long _formTemplateId;
	private long _workflowFormId;
}
