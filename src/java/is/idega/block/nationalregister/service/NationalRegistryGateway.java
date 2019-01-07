package is.idega.block.nationalregister.service;

import com.idega.user.data.User;

public interface NationalRegistryGateway {

	public User getUserFromNationalRegistry(String personalId);

}