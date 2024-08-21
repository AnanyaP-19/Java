package com.xworkz.engineering;

public class Submarine {

	private double length;
	private double beam;
	private double height;
	private int crewCapacity;
	private int maintenanceCycle;
	private double displacement = 7000.0;
	private double maxDivingDepth = 500.0;
	private double maxSpeedSurface = 25.0;
	private double maxSpeedSubmerged = 30.0;
	private double rangeSurface = 10000.0;
	private double rangeSubmerged = 500.0;
	private String hullMaterial = "HY-100 Steel";
	private String propulsionType = "Nuclear";
	private int numberOfTorpedoTubes = 6;
	private int numberOfMissiles = 16;
	private String sonarSystems = "Active Sonar";
	private String radarSystems = "Surface Search Radar";
	private boolean periscope = true;
	private int ballastTanks = 4;
	private double batteryCapacity = 12000.0; 
	private boolean nuclearReactor = true;
	private boolean dieselEngines = false;
	private boolean aipSystem = false;
	private String combatSystem = "AN/BYG-1 Combat Control System";
	private String electronicWarfareSuite = "AN/BLQ-10";
	private String communicationSystems ="VLF/LF Radio";
	private String armamentTypes ="Torpedoes";
	private double torpedoReloadSpeed = 20.0; 
	private int numberOfDecks = 2;
	private double pressureHullIntegrity = 95.0; 
	private String escapeSystems = "Submarine Escape Immersion Equipment (SEIE)";
	private String lifeSupportSystem = "CO2 Scrubbers and O2 Generators";
	private double freshwaterGeneration = 25.0; 
	private String wasteDisposalSystem = "Biological Waste Management System";
	private String stealthCapabilities = "Anechoic Coating, Quiet Propulsion";
	private double acousticSignature = 0.8; 
	private double magneticSignature = 0.5; 
	private double operationalDepth = 300.0; 
	private String launchRecoverySystems = "Dry Deck Shelter (for special forces)";
	private String navigationSystem = "Ring Laser Gyro Inertial Navigation System";
	
	public Submarine(double length,double beam,double height,int crewCapacity,int maintenanceCycle)
	{
		this.length=length;
		this.beam=beam;
		this.height=height;
		this.crewCapacity=crewCapacity;
		this.maintenanceCycle=maintenanceCycle;
	}
	
	public void show()
	{
		System.out.println("Submarine length:"+this.length);
		System.out.println("Submarine beam:"+this.beam);
		System.out.println("Submarine height:"+this.height);
		System.out.println("Submarine crewCapacity:"+this.crewCapacity);
		System.out.println("Submarine maintenanceCycle:"+this.maintenanceCycle);
		System.out.println("Submarine displacement:"+this.displacement);
		System.out.println("Submarine maxDivingDepth:"+this.maxDivingDepth);
		System.out.println("Submarine maxSpeedSurface:"+this.maxSpeedSurface);
		System.out.println("Submarine maxSpeedSubmerged:"+this.maxSpeedSubmerged);
		System.out.println("Submarine rangeSurface:"+this.rangeSurface);
		System.out.println("Submarine rangeSubmerged:"+this.rangeSubmerged);
		System.out.println("Submarine hullMaterial:"+this.hullMaterial);
		System.out.println("Submarine propulsionType:"+this.propulsionType);
		System.out.println("Submarine numberOfTorpedoTubes:"+this.numberOfTorpedoTubes);
		System.out.println("Submarine numberOfMissiles:"+this.numberOfMissiles);
		System.out.println("Submarine sonarSystems:"+this.sonarSystems);
		System.out.println("Submarine radarSystems:"+this.radarSystems);
		System.out.println("Submarine periscope:"+this.periscope);
		System.out.println("Submarine ballastTanks:"+this.ballastTanks);
		System.out.println("Submarine batteryCapacity:"+this.batteryCapacity);
		System.out.println("Submarine nuclearReactor:"+this.nuclearReactor);
		System.out.println("Submarine dieselEngines:"+this.dieselEngines);
		System.out.println("Submarine aipSystem:"+this.aipSystem);
		System.out.println("Submarine combatSystem:"+this.combatSystem);
		System.out.println("Submarine electronicWarfareSuite:"+this.electronicWarfareSuite);
		System.out.println("Submarine communicationSystems:"+this.communicationSystems);
		System.out.println("Submarine armamentTypes:"+this.armamentTypes);
		System.out.println("Submarine torpedoReloadSpeed:"+this.torpedoReloadSpeed);
		System.out.println("Submarine numberOfDecks:"+this.numberOfDecks);
		System.out.println("Submarine pressureHullIntegrity:"+this.pressureHullIntegrity);
		System.out.println("Submarine escapeSystems:"+this.escapeSystems);
		System.out.println("Submarine lifeSupportSystem:"+this.lifeSupportSystem);
		System.out.println("Submarine freshwaterGeneration:"+this.freshwaterGeneration);
		System.out.println("Submarine wasteDisposalSystem:"+this.wasteDisposalSystem);
		System.out.println("Submarine stealthCapabilities:"+this.stealthCapabilities);
		System.out.println("Submarine acousticSignature:"+this.acousticSignature);
		System.out.println("Submarine magneticSignature:"+this.magneticSignature);
		System.out.println("Submarine operationalDepth:"+this.operationalDepth);
		System.out.println("Submarine launchRecoverySystems:"+this.launchRecoverySystems);
		System.out.println("Submarine navigationSystem:"+this.navigationSystem);

	}
   
}
