package com.bankapp.dto;

import java.time.LocalDateTime;

import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
public class ErrorInfo {
	private String message;
	private String errorcode;
	private String tocontact;
	private LocalDateTime dateTime;
}
