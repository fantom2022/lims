export class TestProgramm {
  id: number;
  testProgrammTypeId: number;
  registrationNumber: string;
  productId: number;
  productMaxAmount: number;
  performerDepartmentId: number;
  documentUnderlyingId: number;
  beginDate: Date;
  endDate: Date;

  constructor(id: number, testProgrammTypeId: number, registrationNumber: string, productId: number, productMaxAmount: number, performerDepartmentId: number, documentUnderlyingId: number, beginDate: Date, endDate: Date) {
    this.id = id;
    this.testProgrammTypeId = testProgrammTypeId;
    this.registrationNumber = registrationNumber;
    this.productId = productId;
    this.productMaxAmount = productMaxAmount;
    this.performerDepartmentId = performerDepartmentId;
    this.documentUnderlyingId = documentUnderlyingId;
    this.beginDate = beginDate;
    this.endDate = endDate;
  }
}
