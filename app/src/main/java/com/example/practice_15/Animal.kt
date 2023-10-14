package com.example.practice_15

import android.os.Parcel
import android.os.Parcelable

class Animal(): Parcelable {
    private var name: String = ""
    private var breed: String = ""
    private var birthYear: Int = 0
    private var birthMonth: Int = 0


    constructor(parcel: Parcel): this(){
        name = parcel.readString().toString()
        breed = parcel.readString().toString()
        birthYear = parcel.readInt()
        birthMonth = parcel.readInt()
    }



    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Animal> {
        override fun createFromParcel(parcel: Parcel): Animal {
            return Animal(parcel)
        }

        override fun newArray(size: Int): Array<Animal?> {
            return arrayOfNulls(size)

        }
    }
    constructor(_name: String, _breed: String, _birthYear: Int, _birthMonth: Int): this(){
        name = _name
        breed = _breed
        birthYear = _birthYear
        birthMonth = _birthMonth
    }
    fun setName(_name: String){
        name = _name
    }
    fun getName(): String{
        return name
    }
    fun setBreed(_breed: String){
        breed = _breed
    }
    fun getBreed(): String{
        return breed
    }
    fun setBirthYear(_birthYear: Int){
        birthYear = _birthYear
    }
    fun getBirthYear(): Int{
        return birthYear
    }
    fun setBirthMonth(_birthMonth: Int){
        birthMonth = _birthMonth
    }
    fun getBirthMonth(): Int{
        return birthMonth
    }
    override fun writeToParcel(dest: Parcel, flags: Int) {
        dest?.writeString(name)
        dest?.writeString(breed)
        dest?.writeInt(birthYear)
        dest?.writeInt(birthMonth)
    }

}