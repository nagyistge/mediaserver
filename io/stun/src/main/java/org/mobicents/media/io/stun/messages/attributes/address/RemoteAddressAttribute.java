package org.mobicents.media.io.stun.messages.attributes.address;

/**
 * The REMOTE-ADDRESS is present in Data Indication of old TURN versions.
 * 
 * It specifies the address and port where the data is sent.<br>
 * It is encoded in the same way as MAPPED-ADDRESS.
 */
public class RemoteAddressAttribute extends AddressAttribute {
	public static final String NAME = "REMOTE-ADDRESS";

	protected RemoteAddressAttribute() {
		super(AddressAttribute.REMOTE_ADDRESS);
	}

	@Override
	public String getName() {
		return NAME;
	}
}
