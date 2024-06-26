package service.impl;

import org.springframework.stereotype.Service;

@Service

private userRepository DataLayerAkaRepository
public interface userServiceimpl implements userService{
  @Override
 public void createuser(userSignupRequest req){
 UserEntity userentity=new UserEntity();
 userentity.setEmaliId(req.getEmaliID);
 DataLayerAkaRepository.save()
  }
  @Override
 public boolean validateCredentials(UserLoginRequest req)
  {
   UserEntity userentity=getUserDetails(req.getEmailId());
           boolean isPasswordcorrect= UserEntity.getPassword()equalsreq.getPassword():
   return isPasswordcorrect;
  }
}
