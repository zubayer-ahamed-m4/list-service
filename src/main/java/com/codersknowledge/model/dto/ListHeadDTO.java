/**
 * 
 */
package com.codersknowledge.model.dto;

import java.io.Serializable;

import com.codersknowledge.entity.ListHead;
import com.codersknowledge.model.ErrorResponse;
import com.codersknowledge.model.SuccessResponse;

import lombok.Data;

/**
 * @author zubayer
 *
 */
@Data
public class ListHeadDTO implements Serializable {

	private static final long serialVersionUID = -3182629976866627732L;
	private ListHead listHead;
	private SuccessResponse successResponse;
	private ErrorResponse errorResponse;
}
