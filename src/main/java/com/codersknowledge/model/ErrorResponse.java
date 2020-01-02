/**
 * 
 */
package com.codersknowledge.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import lombok.Data;

/**
 * @author zubayer
 *
 */
@Data
public class ErrorResponse implements Serializable {

	private static final long serialVersionUID = 2444549186153409094L;
	private String errorCode;
	private List<String> errors = new ArrayList<>();
}
