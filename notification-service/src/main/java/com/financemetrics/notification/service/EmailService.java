package com.financemetrics.notification.service;

import com.financemetrics.notification.domain.Recipient;
import com.financemetrics.notification.domain.NotificationType;

import javax.mail.MessagingException;
import java.io.IOException;

public interface EmailService {

	void send(NotificationType type, Recipient recipient, String attachment) throws MessagingException, IOException;

}
