/*
 * Copyright (C) 2011 Klaus Reimer <k@ailis.de>
 * See LICENSE.txt for licensing information.
 */

package de.ailis.usb4java.descriptors;

import javax.usb.UsbDeviceDescriptor;


/**
 * Virtual USB device descriptor used by the virtual USB root hub.
 *
 * @author Klaus Reimer (k@ailis.de)
 */

public final class SimpleUsbDeviceDescriptor extends SimpleUsbDescriptor
    implements UsbDeviceDescriptor
{
    /** Serial version UID. */
    private static final long serialVersionUID = 1L;

    /** The USB specification version number. */
    private final short bcdUSB;

    /** The device class. */
    private final byte bDeviceClass;

    /** The device sub class. */
    private final byte bDeviceSubClass;

    /** The device protocol. */
    private final byte bDeviceProtocol;

    /** The maximum packet size for endpoint zero. */
    private final byte bMaxPacketSize0;

    /** The vendor ID. */
    private final short idVendor;

    /** The product ID. */
    private final short idProduct;

    /** The device release number. */
    private final short bcdDevice;

    /** The manufacturer string descriptor index. */
    private final byte iManufacturer;

    /** The product string descriptor index. */
    private final byte iProduct;

    /** The serial number string descriptor index. */
    private final byte iSerialNumber;

    /** The number of configurations. */
    private final byte bNumConfigurations;


    /**
     * Constructor.
     *
     * @param bLength
     *            The descriptor length.
     * @param bDescriptorType
     *            The descriptor type.
     * @param bcdUSB
     *            The USB specification version number.
     * @param bDeviceClass
     *            The device class.
     * @param bDeviceSubClass
     *            The device sub class.
     * @param bDeviceProtocol
     *            The device protocol.
     * @param bMaxPacketSize0
     *            The maximum packet size for endpoint zero.
     * @param idVendor
     *            The vendor ID.
     * @param idProduct
     *            The product ID.
     * @param bcdDevice
     *            The device release number.
     * @param iManufacturer
     *            The manufacturer string descriptor index.
     * @param iProduct
     *            The product string descriptor index.
     * @param iSerialNumber
     *            The serial number string descriptor index.
     * @param bNumConfigurations
     *            The number of configurations.
     */

    public SimpleUsbDeviceDescriptor(final byte bLength,
        final byte bDescriptorType, final short bcdUSB,
        final byte bDeviceClass, final byte bDeviceSubClass,
        final byte bDeviceProtocol, final byte bMaxPacketSize0,
        final short idVendor, final short idProduct, final short bcdDevice,
        final byte iManufacturer, final byte iProduct,
        final byte iSerialNumber, final byte bNumConfigurations)
    {
        super(bLength, bDescriptorType);
        this.bcdUSB = bcdUSB;
        this.bDeviceClass = bDeviceClass;
        this.bDeviceSubClass = bDeviceSubClass;
        this.bDeviceProtocol = bDeviceProtocol;
        this.bMaxPacketSize0 = bMaxPacketSize0;
        this.idVendor = idVendor;
        this.idProduct = idProduct;
        this.bcdDevice = bcdDevice;
        this.iManufacturer = iManufacturer;
        this.iProduct = iProduct;
        this.iSerialNumber = iSerialNumber;
        this.bNumConfigurations = bNumConfigurations;
    }


    /**
     * @see UsbDeviceDescriptor#bcdUSB()
     */

    @Override
    public short bcdUSB()
    {
        return this.bcdUSB;
    }


    /**
     * @see UsbDeviceDescriptor#bDeviceClass()
     */

    @Override
    public byte bDeviceClass()
    {
        return this.bDeviceClass;
    }


    /**
     * @see UsbDeviceDescriptor#bDeviceSubClass()
     */

    @Override
    public byte bDeviceSubClass()
    {
        return this.bDeviceSubClass;
    }


    /**
     * @see UsbDeviceDescriptor#bDeviceProtocol()
     */

    @Override
    public byte bDeviceProtocol()
    {
        return this.bDeviceProtocol;
    }


    /**
     * @see UsbDeviceDescriptor#bMaxPacketSize0()
     */

    @Override
    public byte bMaxPacketSize0()
    {
        return this.bMaxPacketSize0;
    }


    /**
     * @see UsbDeviceDescriptor#idVendor()
     */

    @Override
    public short idVendor()
    {
        return this.idVendor;
    }


    /**
     * @see UsbDeviceDescriptor#idProduct()
     */

    @Override
    public short idProduct()
    {
        return this.idProduct;
    }


    /**
     * @see UsbDeviceDescriptor#bcdDevice()
     */

    @Override
    public short bcdDevice()
    {
        return this.bcdDevice;
    }


    /**
     * @see UsbDeviceDescriptor#iManufacturer()
     */

    @Override
    public byte iManufacturer()
    {
        return this.iManufacturer;
    }


    /**
     * @see UsbDeviceDescriptor#iProduct()
     */

    @Override
    public byte iProduct()
    {
        return this.iProduct;
    }


    /**
     * @see UsbDeviceDescriptor#iSerialNumber()
     */

    @Override
    public byte iSerialNumber()
    {
        return this.iSerialNumber;
    }


    /**
     * @see UsbDeviceDescriptor#bNumConfigurations()
     */

    @Override
    public byte bNumConfigurations()
    {
        return this.bNumConfigurations;
    }
}