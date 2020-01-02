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
public class SuccessResponse implements Serializable {

	private static final long serialVersionUID = 7146106951472830456L;
	private String succesStatus;
	private List<String> messaages = new ArrayList<>();
}
