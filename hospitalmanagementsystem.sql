-- phpMyAdmin SQL Dump
-- version 2.9.2
-- http://www.phpmyadmin.net
-- 
-- Host: localhost
-- Generation Time: May 02, 2023 at 06:34 PM
-- Server version: 5.0.27
-- PHP Version: 5.2.1
-- 
-- Database: `hospitalmanagementsystem`
-- 

-- --------------------------------------------------------

-- 
-- Table structure for table `appointment`
-- 

CREATE TABLE `appointment` (
  `App_ID` int(11) NOT NULL,
  `Date` date default NULL,
  `Time` time default NULL,
  `Patient_ID` int(11) default NULL,
  `SSN` int(11) default NULL,
  `Sec_ID` int(11) default NULL,
  PRIMARY KEY  (`App_ID`),
  KEY `Patient_ID` (`Patient_ID`),
  KEY `SSN` (`SSN`),
  KEY `Sec_ID` (`Sec_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- 
-- Dumping data for table `appointment`
-- 


-- --------------------------------------------------------

-- 
-- Table structure for table `assign`
-- 

CREATE TABLE `assign` (
  `Patient_ID` int(11) NOT NULL default '0',
  PRIMARY KEY  (`Patient_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- 
-- Dumping data for table `assign`
-- 


-- --------------------------------------------------------

-- 
-- Table structure for table `doctor`
-- 

CREATE TABLE `doctor` (
  `Doc_ID` int(11) NOT NULL auto_increment,
  `SSN` int(11) default NULL,
  `Date_of_Birth` date default NULL,
  `Specialty` varchar(50) default NULL,
  PRIMARY KEY  (`Doc_ID`),
  KEY `SSN` (`SSN`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=137 ;

-- 
-- Dumping data for table `doctor`
-- 


-- --------------------------------------------------------

-- 
-- Table structure for table `interactions`
-- 

CREATE TABLE `interactions` (
  `Location` varchar(50) NOT NULL default '',
  `Date` date NOT NULL default '0000-00-00',
  `Time` time NOT NULL default '00:00:00',
  `Outcome` varchar(50) default NULL,
  `Description` varchar(255) default NULL,
  PRIMARY KEY  (`Location`,`Date`,`Time`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- 
-- Dumping data for table `interactions`
-- 


-- --------------------------------------------------------

-- 
-- Table structure for table `involves`
-- 

CREATE TABLE `involves` (
  `Sec_ID` int(11) NOT NULL default '0',
  `Doc_ID` int(11) NOT NULL default '0',
  `SecSSN` int(11) default NULL,
  `DocSSN` int(11) default NULL,
  `Location` varchar(50) NOT NULL default '',
  `Time` time NOT NULL default '00:00:00',
  `Date` date NOT NULL default '0000-00-00',
  `Patient_ID` int(11) NOT NULL default '0',
  PRIMARY KEY  (`Sec_ID`,`Doc_ID`,`Location`,`Time`,`Date`,`Patient_ID`),
  KEY `Doc_ID` (`Doc_ID`),
  KEY `SecSSN` (`SecSSN`),
  KEY `DocSSN` (`DocSSN`),
  KEY `Patient_ID` (`Patient_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- 
-- Dumping data for table `involves`
-- 


-- --------------------------------------------------------

-- 
-- Table structure for table `medical_records`
-- 

CREATE TABLE `medical_records` (
  `RecordNumber` int(11) NOT NULL,
  `Patient_ID` int(11) default NULL,
  PRIMARY KEY  (`RecordNumber`),
  KEY `Patient_ID` (`Patient_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- 
-- Dumping data for table `medical_records`
-- 


-- --------------------------------------------------------

-- 
-- Table structure for table `patient`
-- 

CREATE TABLE `patient` (
  `Patient_ID` int(11) NOT NULL auto_increment,
  `Gender` char(1) default NULL,
  `Patient_FirstName` varchar(50) default NULL,
  `Patient_LastName` varchar(50) default NULL,
  `PhoneNo` varchar(15) default NULL,
  `Date_of_Birth` date default NULL,
  `SSN` int(11) default NULL,
  `Address` varchar(100) default NULL,
  PRIMARY KEY  (`Patient_ID`),
  UNIQUE KEY `SSN` (`SSN`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=7 ;

-- 
-- Dumping data for table `patient`
-- 


-- --------------------------------------------------------

-- 
-- Table structure for table `patient_diagnosis`
-- 

CREATE TABLE `patient_diagnosis` (
  `Diagnosis_ID` int(11) NOT NULL,
  `RecordNumber` int(11) default NULL,
  `Prognosis` varchar(255) default NULL,
  `Date` date default NULL,
  `Results` varchar(255) default NULL,
  PRIMARY KEY  (`Diagnosis_ID`),
  KEY `RecordNumber` (`RecordNumber`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- 
-- Dumping data for table `patient_diagnosis`
-- 


-- --------------------------------------------------------

-- 
-- Table structure for table `room`
-- 

CREATE TABLE `room` (
  `RoomNo` int(11) NOT NULL,
  `Room_Type` varchar(50) default NULL,
  `Capacity` int(11) default NULL,
  `Location` varchar(50) default NULL,
  `Status` varchar(50) default NULL,
  PRIMARY KEY  (`RoomNo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- 
-- Dumping data for table `room`
-- 

INSERT INTO `room` (`RoomNo`, `Room_Type`, `Capacity`, `Location`, `Status`) VALUES 
(12, 'ER', 2, 'BBC', 'Available');

-- --------------------------------------------------------

-- 
-- Table structure for table `secretary`
-- 

CREATE TABLE `secretary` (
  `Sec_ID` int(11) NOT NULL,
  `SSN` int(11) default NULL,
  PRIMARY KEY  (`Sec_ID`),
  KEY `SSN` (`SSN`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- 
-- Dumping data for table `secretary`
-- 


-- --------------------------------------------------------

-- 
-- Table structure for table `staff`
-- 

CREATE TABLE `staff` (
  `SSN` int(11) NOT NULL,
  `S_FirstName` varchar(50) NOT NULL,
  `S_LastName` varchar(50) NOT NULL,
  `Gender` char(1) default NULL,
  `Years_Experience` int(11) default NULL,
  `Email` varchar(50) default NULL,
  `Phone_No` varchar(15) default NULL,
  `Salary` int(11) default NULL,
  `Department` varchar(50) default NULL,
  PRIMARY KEY  (`SSN`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- 
-- Dumping data for table `staff`
-- 


-- --------------------------------------------------------

-- 
-- Table structure for table `treatment_plan`
-- 

CREATE TABLE `treatment_plan` (
  `Treatment_ID` int(11) NOT NULL,
  `RecordNumber` int(11) default NULL,
  `ProcedureName` varchar(255) default NULL,
  `Start` date default NULL,
  `End` date default NULL,
  `Medications` varchar(255) default NULL,
  PRIMARY KEY  (`Treatment_ID`),
  KEY `RecordNumber` (`RecordNumber`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- 
-- Dumping data for table `treatment_plan`
-- 


-- --------------------------------------------------------

-- 
-- Table structure for table `treats`
-- 

CREATE TABLE `treats` (
  `Patient_ID` int(11) NOT NULL default '0',
  `Doc_ID` int(11) NOT NULL default '0',
  `SSN` int(11) default NULL,
  PRIMARY KEY  (`Patient_ID`,`Doc_ID`),
  KEY `Doc_ID` (`Doc_ID`),
  KEY `SSN` (`SSN`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- 
-- Dumping data for table `treats`
-- 


-- 
-- Constraints for dumped tables
-- 

-- 
-- Constraints for table `appointment`
-- 
ALTER TABLE `appointment`
  ADD CONSTRAINT `appointment_ibfk_1` FOREIGN KEY (`Patient_ID`) REFERENCES `patient` (`Patient_ID`),
  ADD CONSTRAINT `appointment_ibfk_2` FOREIGN KEY (`SSN`) REFERENCES `staff` (`SSN`),
  ADD CONSTRAINT `appointment_ibfk_3` FOREIGN KEY (`Sec_ID`) REFERENCES `secretary` (`Sec_ID`);

-- 
-- Constraints for table `assign`
-- 
ALTER TABLE `assign`
  ADD CONSTRAINT `assign_ibfk_1` FOREIGN KEY (`Patient_ID`) REFERENCES `patient` (`Patient_ID`);

-- 
-- Constraints for table `doctor`
-- 
ALTER TABLE `doctor`
  ADD CONSTRAINT `doctor_ibfk_1` FOREIGN KEY (`SSN`) REFERENCES `staff` (`SSN`);

-- 
-- Constraints for table `involves`
-- 
ALTER TABLE `involves`
  ADD CONSTRAINT `involves_ibfk_1` FOREIGN KEY (`Sec_ID`) REFERENCES `secretary` (`Sec_ID`),
  ADD CONSTRAINT `involves_ibfk_2` FOREIGN KEY (`Doc_ID`) REFERENCES `doctor` (`Doc_ID`),
  ADD CONSTRAINT `involves_ibfk_3` FOREIGN KEY (`SecSSN`) REFERENCES `staff` (`SSN`),
  ADD CONSTRAINT `involves_ibfk_4` FOREIGN KEY (`DocSSN`) REFERENCES `staff` (`SSN`),
  ADD CONSTRAINT `involves_ibfk_5` FOREIGN KEY (`Patient_ID`) REFERENCES `patient` (`Patient_ID`);

-- 
-- Constraints for table `medical_records`
-- 
ALTER TABLE `medical_records`
  ADD CONSTRAINT `medical_records_ibfk_1` FOREIGN KEY (`Patient_ID`) REFERENCES `patient` (`Patient_ID`);

-- 
-- Constraints for table `patient_diagnosis`
-- 
ALTER TABLE `patient_diagnosis`
  ADD CONSTRAINT `patient_diagnosis_ibfk_1` FOREIGN KEY (`RecordNumber`) REFERENCES `medical_records` (`RecordNumber`);

-- 
-- Constraints for table `secretary`
-- 
ALTER TABLE `secretary`
  ADD CONSTRAINT `secretary_ibfk_1` FOREIGN KEY (`SSN`) REFERENCES `staff` (`SSN`);

-- 
-- Constraints for table `treatment_plan`
-- 
ALTER TABLE `treatment_plan`
  ADD CONSTRAINT `treatment_plan_ibfk_1` FOREIGN KEY (`RecordNumber`) REFERENCES `medical_records` (`RecordNumber`);

-- 
-- Constraints for table `treats`
-- 
ALTER TABLE `treats`
  ADD CONSTRAINT `treats_ibfk_1` FOREIGN KEY (`Patient_ID`) REFERENCES `patient` (`Patient_ID`),
  ADD CONSTRAINT `treats_ibfk_2` FOREIGN KEY (`Doc_ID`) REFERENCES `doctor` (`Doc_ID`),
  ADD CONSTRAINT `treats_ibfk_3` FOREIGN KEY (`SSN`) REFERENCES `staff` (`SSN`);
