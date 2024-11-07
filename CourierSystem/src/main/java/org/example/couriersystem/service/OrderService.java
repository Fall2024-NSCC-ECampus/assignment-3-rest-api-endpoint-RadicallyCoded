package org.example.couriersystem.service;

import org.example.couriersystem.Address;
import org.example.couriersystem.PackageInfo;
import org.example.couriersystem.Recipient;
import org.example.couriersystem.Retailer;
import org.example.couriersystem.repository.AddressRepository;
import org.example.couriersystem.repository.PackageRepository;
import org.example.couriersystem.repository.RecipientRepository;
import org.example.couriersystem.repository.RetailerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private final PackageRepository packageRepository;

    @Autowired
    private final AddressRepository addressRepository;

    @Autowired
    private final RecipientRepository recipientRepository;

    @Autowired
    private final RetailerRepository retailerRepository;

    public OrderService(PackageRepository packageRepository, AddressRepository addressRepository, RecipientRepository recipientRepository, RetailerRepository retailerRepository) {
        this.packageRepository = packageRepository;
        this.addressRepository = addressRepository;
        this.recipientRepository = recipientRepository;
        this.retailerRepository = retailerRepository;
    }

    public PackageInfo createPackage(double weight, double height, double length, double width) {
        PackageInfo packageInfo = new PackageInfo();

        packageInfo.setWeight(weight);
        packageInfo.setHeight(height);
        packageInfo.setLength(length);
        packageInfo.setWidth(width);

        return packageRepository.save(packageInfo);
    }

    public Address RecipientAddress(String street, String city, String province, String postalCode) {
        Address recipientAddress = new Address(street, city, province, postalCode);

        recipientAddress.setStreet(street);
        recipientAddress.setCity(city);
        recipientAddress.setProvince(province);
        recipientAddress.setPostalCode(postalCode);

        return addressRepository.save(recipientAddress);
    }

    public Recipient createRecipient(Long recipientId,String name, String phoneNum, String email, Address address) {
        Recipient recipient = new Recipient(recipientId, name, address, phoneNum, email);

        recipient.setName(name);
        recipient.setAddress(address);
        recipient.setPhoneNum(phoneNum);
        recipient.setEmail(email);

        return recipientRepository.save(recipient);
    }

    public Address RetailerAddress(String street, String city, String province, String postalCode) {
        Address retailerAddress = new Address(street, city, province, postalCode);

        retailerAddress.setStreet(street);
        retailerAddress.setCity(city);
        retailerAddress.setProvince(province);
        retailerAddress.setPostalCode(postalCode);

        return addressRepository.save(retailerAddress);
    }

    public Retailer createRetailer(Long retailerId,String name, String phoneNum, String email, Address address) {
        Retailer retailer = new Retailer(retailerId, name, address, phoneNum, email);

        retailer.setName(name);
        retailer.setAddress(address);
        retailer.setPhoneNum(phoneNum);
        retailer.setEmail(email);

        return retailerRepository.save(retailer);
    }

    //method for creating order
}
