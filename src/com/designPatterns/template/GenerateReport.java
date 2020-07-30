package com.designPatterns.template;

public class GenerateReport {
    private AuditTrail auditTrail;

    public GenerateReport(AuditTrail auditTrail) {
        this.auditTrail = auditTrail;
    }

    public void execute(){
        auditTrail.record();
        System.out.println("Generate Report");
    }
}
