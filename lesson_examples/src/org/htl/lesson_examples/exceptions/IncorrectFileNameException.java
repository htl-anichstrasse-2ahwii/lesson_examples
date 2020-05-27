package org.htl.lesson_examples.exceptions;

public class IncorrectFileNameException extends Exception {
	//Wird als Versionsnummer fuer die Serialisierung verwendet. Laesst man in diesem Fall nur generieren, damit die Warning - Message verschwindet
	private static final long serialVersionUID = 1L;

	public IncorrectFileNameException(String errorMessage) {
        super(errorMessage);
    }
}
