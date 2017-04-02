package org.alexdev.roseau.messages.outgoing.register;

import org.alexdev.roseau.messages.outgoing.OutgoingMessageComposer;
import org.alexdev.roseau.server.messages.Response;

public class BADNAME implements OutgoingMessageComposer {

	@Override
	public void write(Response response) {
		response.init("BADNAME");
	}
}